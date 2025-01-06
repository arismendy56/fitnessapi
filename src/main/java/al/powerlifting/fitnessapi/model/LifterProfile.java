package al.powerlifting.fitnessapi.model;

import java.util.List;

public class LifterProfile {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String weightClass;
    private GymMaxes gymMaxes;
    private CompetitionMaxes competitionMaxes;
    private List<Competition> competitionList;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public GymMaxes getGymMaxes() {
        return gymMaxes;
    }

    public void setGymMaxes(GymMaxes gymMaxes) {
        this.gymMaxes = gymMaxes;
    }

    public CompetitionMaxes getCompetitionMaxes() {
        return competitionMaxes;
    }

    public void setCompetitionMaxes(CompetitionMaxes competitionMaxes) {
        this.competitionMaxes = competitionMaxes;
    }

    public List<Competition> getCompetitionList() {
        return competitionList;
    }

    public void setCompetitionList(List<Competition> competitionList) {
        this.competitionList = competitionList;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "LifterProfile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weightClass='" + weightClass + '\'' +
                ", gymMaxes=" + gymMaxes +
                ", competitionMaxes=" + competitionMaxes +
                ", competitionList=" + competitionList +
                '}';
    }
}
