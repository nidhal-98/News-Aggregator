IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'articles')
BEGIN
CREATE TABLE articles(
Article_Title VARCHAR(MAX),
Author VARCHAR(MAX),
Article_Date VARCHAR(MAX),
Category VARCHAR(MAX),
Content VARCHAR(MAX)
);
END

select *
from articles

select *
from articles
where Category = 'sports'