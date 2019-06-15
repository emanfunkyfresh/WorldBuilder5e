CREATE TABLE IF NOT EXISTS StatBlock(
       SB_uuid INT,
       SB_name TEXT,
       SB_type TEXT,
       SB_subtype TEXT,
       SB_armorClass INT,
       SB_hitPoints INT,
       SB_hitDice TEXT,
       SB_speed TEXT,
       SB_senses TEXT,
       SB_languages TEXT,
       SB_challengeRating ENUM ('0','1/8','1/4','1/2','1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30'),
       PRIMARY KEY(SB_uuid)
) ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS Skills(
       SB_uuid INT,
       SK_name TEXT,
       SK_attribute ENUM ('Strength','Dexterity','Constitution','Intelligence','Wisdom','Charisma'),
       SK_score INT,
       FOREIGN KEY(SB_uuid)
       	       REFERENCES StatBlock(SB_uuid)
	       ON DELETE CASCADE
) ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS Attributes(
       SB_uuid INT,
       ATTR_type ENUM ('Strength','Dexterity','Constitution','Intelligence','Wisdom','Charisma'),
       ATTR_name TEXT,
       ATTR_score INT,
       FOREIGN KEY(SB_uuid)
       	       REFERENCES StatBlock(SB_uuid)
	       ON DELETE CASCADE
) ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS Qualities(
       SB_uuid INT,
       QUAL_name TEXT,
       QUAL_desc TEXT,
       FOREIGN KEY(SB_uuid)
       	       REFERENCES StatBlock(SB_uuid)
	       ON DELETE CASCADE
) ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS Resistances(
       SB_uuid INT,
       RES_vector ENUM ('Condition','Damage'),
       RES_type TEXT,
       RES_rating ENUM ('V','R','I'),
       FOREIGN KEY(SB_uuid)
       	       REFERENCES StatBlock(SB_uuid)
	       ON DELETE CASCADE
) ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS Actions(
       SB_uuid INT,
       ACT_type ENUM ('Normal','Legendary','Lair','Bonus'),
       ACT_name TEXT,
       ACT_desc TEXT,
       ACT_rating TEXT,
       ACT_damage TEXT,
       FOREIGN KEY(SB_uuid)
       	       REFERENCES StatBlock(SB_uuid)
	       ON DELETE CASCADE
) ENGINE=INNODB;
