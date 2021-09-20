package com.memorandum.domain.model;


import com.memorandum.infrastructure.database.record.custom.ArticleSet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArticleSetModel {
    private Integer articleId;
    private String articleTitle;
    private String authorId;
    private String authorName;
    private String language;
    private String category;
    private LocalDate createdDate;
    private LocalDate updateDate;
    List<ArticleSetOneModel> articleContentList = new ArrayList<>();

    public ArticleSetModel(ArticleSet articleSet) {
        this.articleId = articleSet.getArticleId();
        this.articleTitle = articleSet.getArticleTitle();
        this.authorId = articleSet.getAuthorId();
        this.authorName = articleSet.getAuthorName();
        this.language = articleSet.getLanguage();
        this.category = articleSet.getCategory();
        this.createdDate = articleSet.getCreatedDate();
        this.updateDate = articleSet.getUpdateDate();
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle1(), articleSet.getContent1(), articleSet.getOption1()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle2(), articleSet.getContent2(), articleSet.getOption2()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle3(), articleSet.getContent3(), articleSet.getOption3()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle4(), articleSet.getContent4(), articleSet.getOption4()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle5(), articleSet.getContent5(), articleSet.getOption5()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle6(), articleSet.getContent6(), articleSet.getOption6()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle7(), articleSet.getContent7(), articleSet.getOption7()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle8(), articleSet.getContent8(), articleSet.getOption8()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle9(), articleSet.getContent9(), articleSet.getOption9()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle10(), articleSet.getContent10(), articleSet.getOption10()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle11(), articleSet.getContent11(), articleSet.getOption11()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle12(), articleSet.getContent12(), articleSet.getOption12()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle13(), articleSet.getContent13(), articleSet.getOption13()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle14(), articleSet.getContent14(), articleSet.getOption14()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle15(), articleSet.getContent15(), articleSet.getOption15()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle16(), articleSet.getContent16(), articleSet.getOption16()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle17(), articleSet.getContent17(), articleSet.getOption17()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle18(), articleSet.getContent18(), articleSet.getOption18()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle19(), articleSet.getContent19(), articleSet.getOption19()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle20(), articleSet.getContent20(), articleSet.getOption20()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle21(), articleSet.getContent21(), articleSet.getOption21()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle22(), articleSet.getContent22(), articleSet.getOption22()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle23(), articleSet.getContent23(), articleSet.getOption23()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle24(), articleSet.getContent24(), articleSet.getOption24()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle25(), articleSet.getContent25(), articleSet.getOption25()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle26(), articleSet.getContent26(), articleSet.getOption26()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle27(), articleSet.getContent27(), articleSet.getOption27()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle28(), articleSet.getContent28(), articleSet.getOption28()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle29(), articleSet.getContent29(), articleSet.getOption29()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle30(), articleSet.getContent30(), articleSet.getOption30()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle31(), articleSet.getContent31(), articleSet.getOption31()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle32(), articleSet.getContent32(), articleSet.getOption32()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle33(), articleSet.getContent33(), articleSet.getOption33()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle34(), articleSet.getContent34(), articleSet.getOption34()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle35(), articleSet.getContent35(), articleSet.getOption35()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle36(), articleSet.getContent36(), articleSet.getOption36()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle37(), articleSet.getContent37(), articleSet.getOption37()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle38(), articleSet.getContent38(), articleSet.getOption38()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle39(), articleSet.getContent39(), articleSet.getOption39()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle40(), articleSet.getContent40(), articleSet.getOption40()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle41(), articleSet.getContent41(), articleSet.getOption41()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle42(), articleSet.getContent42(), articleSet.getOption42()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle43(), articleSet.getContent43(), articleSet.getOption43()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle44(), articleSet.getContent44(), articleSet.getOption44()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle45(), articleSet.getContent45(), articleSet.getOption45()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle46(), articleSet.getContent46(), articleSet.getOption46()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle47(), articleSet.getContent47(), articleSet.getOption47()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle48(), articleSet.getContent48(), articleSet.getOption48()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle49(), articleSet.getContent49(), articleSet.getOption49()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle50(), articleSet.getContent50(), articleSet.getOption50()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle51(), articleSet.getContent51(), articleSet.getOption51()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle52(), articleSet.getContent52(), articleSet.getOption52()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle53(), articleSet.getContent53(), articleSet.getOption53()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle54(), articleSet.getContent54(), articleSet.getOption54()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle55(), articleSet.getContent55(), articleSet.getOption55()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle56(), articleSet.getContent56(), articleSet.getOption56()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle57(), articleSet.getContent57(), articleSet.getOption57()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle58(), articleSet.getContent58(), articleSet.getOption58()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle59(), articleSet.getContent59(), articleSet.getOption59()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle60(), articleSet.getContent60(), articleSet.getOption60()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle61(), articleSet.getContent61(), articleSet.getOption61()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle62(), articleSet.getContent62(), articleSet.getOption62()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle63(), articleSet.getContent63(), articleSet.getOption63()));
        this.articleContentList.add(new ArticleSetOneModel(articleSet.getStyle64(), articleSet.getContent64(), articleSet.getOption64()));

        for(int i = 63; i >= 0; i--) {
            String str = articleContentList.get(i).toString();
            if(str == null) {
                articleContentList.remove(i);
            }
        }
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

    public List<ArticleSetOneModel> getArticleContentList() {
        return articleContentList;
    }

    public void setArticleContentList(List<ArticleSetOneModel> articleContentList) {
        this.articleContentList = articleContentList;
    }
}
