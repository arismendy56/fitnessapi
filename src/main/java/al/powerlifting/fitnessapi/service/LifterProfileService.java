package al.powerlifting.fitnessapi.service;

import al.powerlifting.fitnessapi.excelreader.LifterProfileReader;
import al.powerlifting.fitnessapi.model.LifterProfile;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class LifterProfileService {

    private LifterProfileReader lifterProfileReader;

    public LifterProfileService(LifterProfileReader lifterProfileReader) {
        this.lifterProfileReader = lifterProfileReader;
    }

    public LifterProfile getProfile() throws IOException {

        return lifterProfileReader.readLifterProfileData();
    }

}
