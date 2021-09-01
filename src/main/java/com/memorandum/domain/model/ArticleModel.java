package com.memorandum.domain.model;

import com.memorandum.infrastructure.database.record.custom.Article;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArticleModel {
    private Integer articleId;
    private String articleTitle;
    private String authorId;
    private String authorName;
    private String language;
    private String category;
    private LocalDate createdDate;
    private LocalDate updateDate;
    private Integer contentId;
    private List<ArticleContentOneModel> articleContentList = new ArrayList<>();

    public ArticleModel(Article article) {
        this.articleId = article.getArticleId();
        this.articleTitle = article.getArticleTitle();
        this.authorId = article.getAuthorId();
        this.authorName = article.getAuthorName();
        this.language = article.getLanguage();
        this.category = article.getCategory();
        this.createdDate = article.getCreatedDate();
        this.updateDate = article.getUpdateDate();
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle1(), article.getContent1(), article.getOption1()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle2(), article.getContent2(), article.getOption2()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle3(), article.getContent3(), article.getOption3()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle4(), article.getContent4(), article.getOption4()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle5(), article.getContent5(), article.getOption5()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle6(), article.getContent6(), article.getOption6()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle7(), article.getContent7(), article.getOption7()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle8(), article.getContent8(), article.getOption8()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle9(), article.getContent9(), article.getOption9()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle10(), article.getContent10(), article.getOption10()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle11(), article.getContent11(), article.getOption11()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle12(), article.getContent12(), article.getOption12()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle13(), article.getContent13(), article.getOption13()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle14(), article.getContent14(), article.getOption14()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle15(), article.getContent15(), article.getOption15()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle16(), article.getContent16(), article.getOption16()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle17(), article.getContent17(), article.getOption17()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle18(), article.getContent18(), article.getOption18()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle19(), article.getContent19(), article.getOption19()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle20(), article.getContent20(), article.getOption20()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle21(), article.getContent21(), article.getOption21()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle22(), article.getContent22(), article.getOption22()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle23(), article.getContent23(), article.getOption23()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle24(), article.getContent24(), article.getOption24()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle25(), article.getContent25(), article.getOption25()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle26(), article.getContent26(), article.getOption26()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle27(), article.getContent27(), article.getOption27()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle28(), article.getContent28(), article.getOption28()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle29(), article.getContent29(), article.getOption29()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle30(), article.getContent30(), article.getOption30()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle31(), article.getContent31(), article.getOption31()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle32(), article.getContent32(), article.getOption32()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle33(), article.getContent33(), article.getOption33()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle34(), article.getContent34(), article.getOption34()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle35(), article.getContent35(), article.getOption35()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle36(), article.getContent36(), article.getOption36()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle37(), article.getContent37(), article.getOption37()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle38(), article.getContent38(), article.getOption38()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle39(), article.getContent39(), article.getOption39()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle40(), article.getContent40(), article.getOption40()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle41(), article.getContent41(), article.getOption41()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle42(), article.getContent42(), article.getOption42()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle43(), article.getContent43(), article.getOption43()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle44(), article.getContent44(), article.getOption44()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle45(), article.getContent45(), article.getOption45()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle46(), article.getContent46(), article.getOption46()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle47(), article.getContent47(), article.getOption47()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle48(), article.getContent48(), article.getOption48()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle49(), article.getContent49(), article.getOption49()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle50(), article.getContent50(), article.getOption50()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle51(), article.getContent51(), article.getOption51()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle52(), article.getContent52(), article.getOption52()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle53(), article.getContent53(), article.getOption53()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle54(), article.getContent54(), article.getOption54()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle55(), article.getContent55(), article.getOption55()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle56(), article.getContent56(), article.getOption56()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle57(), article.getContent57(), article.getOption57()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle58(), article.getContent58(), article.getOption58()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle59(), article.getContent59(), article.getOption59()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle60(), article.getContent60(), article.getOption60()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle61(), article.getContent61(), article.getOption61()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle62(), article.getContent62(), article.getOption62()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle63(), article.getContent63(), article.getOption63()));
        this.articleContentList.add(new ArticleContentOneModel(article.getStyle64(), article.getContent64(), article.getOption64()));
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public List<ArticleContentOneModel> getArticleContentList() {
        return articleContentList;
    }

    public void setArticleContentList(List<ArticleContentOneModel> articleContentList) {
        this.articleContentList = articleContentList;
    }
}
