package projectrider.bindingModel;

public class ProjectBindingModel {

    // TODO
    private String title;
    private String description;
    private Integer budget;


    public ProjectBindingModel() {
    }

    public ProjectBindingModel(String title, String description, Integer budget) {
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    public String getTitle() {

        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBudget() {
        return this.budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }
}
