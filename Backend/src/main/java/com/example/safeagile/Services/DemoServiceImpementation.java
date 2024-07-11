package com.example.safeagile.Services;

import com.example.safeagile.Models.Demo;
import com.example.safeagile.Repositories.IDemoRepository;
import com.jayway.jsonpath.Criteria;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DemoServiceImpementation implements IDemoService {
    private final IDemoRepository demoRepository;

    public Demo addDemo(
            String S1_FS_Title, String S1_FS_Description, MultipartFile S1_FS_Image,
            String S1_SS_Introduction, MultipartFile S1_SS_Image,
            String S2_FS_Title,
            String S2_SS_Title, String S2_SS_Benefits1, String S2_SS_Benefits2, String S2_SS_Benefits3, String S2_SS_Benefits4,
            String S2_SS_Limitations1, String S2_SS_Limitations2, String S2_SS_Limitations3, String S2_SS_Limitations4,
            String S3_FS_Title, String S3_FS_Subtitle, String S3_FS_Description, MultipartFile S3_FS_Image,
            String S3_SS_Title, String S3_SS_Subtitle, MultipartFile S3_SS_Image,
            String S3_TS_Title, MultipartFile S3_TS_Image, String S3_TS_Ex_Text1, String S3_TS_Ex_Text2, String S3_TS_Ex_Text3, String S3_TS_Ex_Text4,
            String S3_FoS_Title, String S3_FoS_Subtitle, String S3_FoS_Text1, String S3_FoS_Text2, String S3_FoS_Text3, String S3_FoS_Text4,
            String S3_FoS_Text5, String S3_FoS_Text6, String S3_FoS_Text7, String S3_FoS_Text8, String S3_FoS_Text9, String S3_FoS_Text10,
            String S3_FiS_Title_center, String S3_FiS_Title1, String S3_FiS_Subtitle1, String S3_FiS_Title2, String S3_FiS_Subtitle2,
            String S3_FiS_Title3, String S3_FiS_Subtitle3, String S3_FiS_Title4, String S3_FiS_Subtitle4,
            String S3_SIS_Title_center, String S3_SIS_Title1, String S3_SIS_Subtitle1, String S3_SIS_Title2, String S3_SIS_Subtitle2,
            String S3_SIS_Title3, String S3_SIS_Subtitle3, String S3_SIS_Title4, String S3_SIS_Subtitle4, String S3_SIS_Title5, String S3_SIS_Subtitle5,
            String S3_SES_Title_center, String S3_SES_Title1, String S3_SES_Subtitle1, String S3_SES_Title2, String S3_SES_Subtitle2,
            String S3_SES_Title3, String S3_SES_Subtitle3, String S3_SES_Title4, String S3_SES_Subtitle4,
            String S4_FS_Title, String S4_FS_Subtitle, String S4_FS_Description, MultipartFile S4_FS_Image,
            String S4_SS_Description, MultipartFile S4_SS_Image, String S4_TS_Title, String S4_TS_Subtitle, MultipartFile S4_TS_Image,
            String S5_FS_Title, String S5_FS_Description, MultipartFile S5_FS_Image, String S5_SS_Title1, String S5_SS_Description1, MultipartFile S5_SS_Image1,
            String S5_SS_Title2, String S5_SS_Description2, MultipartFile S5_SS_Image2, String S5_SS_Title3, String S5_SS_Description3, MultipartFile S5_SS_Image3,
            String S5_SS_Title4, String S5_SS_Description4, MultipartFile S5_SS_Image4, String S5_SS_Title5, String S5_SS_Description5, MultipartFile S5_SS_Image5,
            String S5_SS_Title6, String S5_SS_Description6, MultipartFile S5_SS_Image6,
            String S6_Title, String S6_Subtitle, String S6_FS_Description_prob1, String S6_FS_Description6_solu1,
            String S6_SS_Description_prob2, String S6_SS_Description6_solu2, String S6_TS_Description_prob3, String S6_TS_Description6_solu3,
            String S6_FOS_Description_prob4, String S6_FOS_Description6_solu4, String Footer_Desc
    ) throws IOException {
        Demo demo = new Demo();

        // First Step
        demo.setS1_FS_Title(S1_FS_Title);
        demo.setS1_FS_Description(S1_FS_Description);
        demo.setS1_FS_Image(new Binary(S1_FS_Image.getBytes()));
        demo.setS1_SS_Introduction(S1_SS_Introduction);
        demo.setS1_SS_Image(new Binary(S1_SS_Image.getBytes()));

        // Second Step
        demo.setS2_FS_Title(S2_FS_Title);
        demo.setS2_SS_Title(S2_SS_Title);
        demo.setS2_SS_Benefits1(S2_SS_Benefits1);
        demo.setS2_SS_Benefits2(S2_SS_Benefits2);
        demo.setS2_SS_Benefits3(S2_SS_Benefits3);
        demo.setS2_SS_Benefits4(S2_SS_Benefits4);
        demo.setS2_SS_Limitations1(S2_SS_Limitations1);
        demo.setS2_SS_Limitations2(S2_SS_Limitations2);
        demo.setS2_SS_Limitations3(S2_SS_Limitations3);
        demo.setS2_SS_Limitations4(S2_SS_Limitations4);

        // Third Step
        demo.setS3_FS_Title(S3_FS_Title);
        demo.setS3_FS_Subtitle(S3_FS_Subtitle);
        demo.setS3_FS_Description(S3_FS_Description);
        demo.setS3_FS_Image(new Binary(S3_FS_Image.getBytes()));
        demo.setS3_SS_Title(S3_SS_Title);
        demo.setS3_SS_Subtitle(S3_SS_Subtitle);
        demo.setS3_SS_Image(new Binary(S3_SS_Image.getBytes()));
        demo.setS3_TS_Title(S3_TS_Title);
        demo.setS3_TS_Image(new Binary(S3_TS_Image.getBytes()));
        demo.setS3_TS_Ex_Text1(S3_TS_Ex_Text1);
        demo.setS3_TS_Ex_Text2(S3_TS_Ex_Text2);
        demo.setS3_TS_Ex_Text3(S3_TS_Ex_Text3);
        demo.setS3_TS_Ex_Text4(S3_TS_Ex_Text4);
        demo.setS3_FoS_Title(S3_FoS_Title);
        demo.setS3_FoS_Subtitle(S3_FoS_Subtitle);
        demo.setS3_FoS_Text1(S3_FoS_Text1);
        demo.setS3_FoS_Text2(S3_FoS_Text2);
        demo.setS3_FoS_Text3(S3_FoS_Text3);
        demo.setS3_FoS_Text4(S3_FoS_Text4);
        demo.setS3_FoS_Text5(S3_FoS_Text5);
        demo.setS3_FoS_Text6(S3_FoS_Text6);
        demo.setS3_FoS_Text7(S3_FoS_Text7);
        demo.setS3_FoS_Text8(S3_FoS_Text8);
        demo.setS3_FoS_Text9(S3_FoS_Text9);
        demo.setS3_FoS_Text10(S3_FoS_Text10);
        demo.setS3_FiS_Title_center(S3_FiS_Title_center);
        demo.setS3_FiS_Title1(S3_FiS_Title1);
        demo.setS3_FiS_Subtitle1(S3_FiS_Subtitle1);
        demo.setS3_FiS_Title2(S3_FiS_Title2);
        demo.setS3_FiS_Subtitle2(S3_FiS_Subtitle2);
        demo.setS3_FiS_Title3(S3_FiS_Title3);
        demo.setS3_FiS_Subtitle3(S3_FiS_Subtitle3);
        demo.setS3_FiS_Title4(S3_FiS_Title4);
        demo.setS3_FiS_Subtitle4(S3_FiS_Subtitle4);
        demo.setS3_SIS_Title_center(S3_SIS_Title_center);
        demo.setS3_SIS_Title1(S3_SIS_Title1);
        demo.setS3_SIS_Subtitle1(S3_SIS_Subtitle1);
        demo.setS3_SIS_Title2(S3_SIS_Title2);
        demo.setS3_SIS_Subtitle2(S3_SIS_Subtitle2);
        demo.setS3_SIS_Title3(S3_SIS_Title3);
        demo.setS3_SIS_Subtitle3(S3_SIS_Subtitle3);
        demo.setS3_SIS_Title4(S3_SIS_Title4);
        demo.setS3_SIS_Subtitle4(S3_SIS_Subtitle4);
        demo.setS3_SIS_Title5(S3_SIS_Title5);
        demo.setS3_SIS_Subtitle5(S3_SIS_Subtitle5);
        demo.setS3_SES_Title_center(S3_SES_Title_center);
        demo.setS3_SES_Title1(S3_SES_Title1);
        demo.setS3_SES_Subtitle1(S3_SES_Subtitle1);
        demo.setS3_SES_Title2(S3_SES_Title2);
        demo.setS3_SES_Subtitle2(S3_SES_Subtitle2);
        demo.setS3_SES_Title3(S3_SES_Title3);
        demo.setS3_SES_Subtitle3(S3_SES_Subtitle3);
        demo.setS3_SES_Title4(S3_SES_Title4);
        demo.setS3_SES_Subtitle4(S3_SES_Subtitle4);

        // Fourth Step
        demo.setS4_FS_Title(S4_FS_Title);
        demo.setS4_FS_Subtitle(S4_FS_Subtitle);
        demo.setS4_FS_Description(S4_FS_Description);
        demo.setS4_FS_Image(new Binary(S4_FS_Image.getBytes()));
        demo.setS4_SS_Description(S4_SS_Description);
        demo.setS4_SS_Image(new Binary(S4_SS_Image.getBytes()));
        demo.setS4_TS_Title(S4_TS_Title);
        demo.setS4_TS_Subtitle(S4_TS_Subtitle);
        demo.setS4_TS_Image(new Binary(S4_TS_Image.getBytes()));

        // Fifth Step
        demo.setS5_FS_Title(S5_FS_Title);
        demo.setS5_FS_Description(S5_FS_Description);
        demo.setS5_FS_Image(new Binary(S5_FS_Image.getBytes()));
        demo.setS5_SS_Title1(S5_SS_Title1);
        demo.setS5_SS_Description1(S5_SS_Description1);
        demo.setS5_SS_Image1(new Binary(S5_SS_Image1.getBytes()));
        demo.setS5_SS_Title2(S5_SS_Title2);
        demo.setS5_SS_Description2(S5_SS_Description2);
        demo.setS5_SS_Image2(new Binary(S5_SS_Image2.getBytes()));
        demo.setS5_SS_Title3(S5_SS_Title3);
        demo.setS5_SS_Description3(S5_SS_Description3);
        demo.setS5_SS_Image3(new Binary(S5_SS_Image3.getBytes()));
        demo.setS5_SS_Title4(S5_SS_Title4);
        demo.setS5_SS_Description4(S5_SS_Description4);
        demo.setS5_SS_Image4(new Binary(S5_SS_Image4.getBytes()));
        demo.setS5_SS_Title5(S5_SS_Title5);
        demo.setS5_SS_Description5(S5_SS_Description5);
        demo.setS5_SS_Image5(new Binary(S5_SS_Image5.getBytes()));
        demo.setS5_SS_Title6(S5_SS_Title6);
        demo.setS5_SS_Description6(S5_SS_Description6);
        demo.setS5_SS_Image6(new Binary(S5_SS_Image6.getBytes()));

        // Sixth Step
        demo.setS6_Title(S6_Title);
        demo.setS6_Subtitle(S6_Subtitle);
        demo.setS6_FS_Description_prob1(S6_FS_Description_prob1);
        demo.setS6_FS_Description6_solu1(S6_FS_Description6_solu1);
        demo.setS6_SS_Description_prob2(S6_SS_Description_prob2);
        demo.setS6_SS_Description6_solu2(S6_SS_Description6_solu2);
        demo.setS6_TS_Description_prob3(S6_TS_Description_prob3);
        demo.setS6_TS_Description6_solu3(S6_TS_Description6_solu3);
        demo.setS6_FOS_Description_prob4(S6_FOS_Description_prob4);
        demo.setS6_FOS_Description6_solu4(S6_FOS_Description6_solu4);

        // Footer
        demo.setFooter_Desc(Footer_Desc);
        return demoRepository.save(demo);
    }
private Binary uploadImage(MultipartFile file) throws IOException {
    return new Binary(file.getBytes());
}


    @Override
    public Demo UpdateDemo(Demo demo) {
        return null;
    }
    public Optional<Demo> getById(String id) {
        return demoRepository.findById(id);
    }





}
