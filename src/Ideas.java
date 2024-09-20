/**
 * Class to hold all details for Idea Projects
 */
public class Ideas {
    public String Idea;
    public String ImageFile;
    public String WebLink;
    public String Materials;
    public String Hints;

    /**
     * Blank Constructor so we can create Blank Ideas
     */
    public Ideas(){}
    //

    /**
     * Full Constructor for creating ideas
     * @param idea Title for idea project
     * @param imageFile Filepath for project
     * @param webLink Weblink for project
     * @param materials List of Materials for project (as string)
     * @param hints Hints for project
     */
    public Ideas(String idea,String imageFile,String webLink,String materials,String hints)
    {
        Idea = idea;
        ImageFile = imageFile;
        WebLink = webLink;
        Materials = materials;
        Hints = hints;
    }

    /**
     * override for toString Method to return custom string
     * @return String with all elements joined by: ;
     */
    @Override
    public String toString()
    {
        return Idea + ";" + ImageFile + ";" + WebLink + ";" + Materials + ";" + Hints;
    }

    /**
     * returns idea title as string
     * @return String --> @Idea
     */
    public String getIdea()
    {
        return Idea;
    }
}
