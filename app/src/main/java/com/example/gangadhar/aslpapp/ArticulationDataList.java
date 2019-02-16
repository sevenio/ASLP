package com.example.gangadhar.aslpapp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArticulationDataList {
    public ArrayList<ArticulationData> getArticulationDataArrayList() {
        return articulationDataArrayList;
    }

    public void setArticulationDataArrayList(ArrayList<ArticulationData> articulationDataArrayList) {
        this.articulationDataArrayList = articulationDataArrayList;
    }

    private ArrayList<ArticulationData> articulationDataArrayList;


    public ArticulationDataList() {
        articulationDataArrayList = new ArrayList<>();


        articulationDataArrayList.add(
                builArticulationData(
                        R.string.అ
                        , buildInitialList(
                                builArticulationDataItem(R.string.అరటి_పండు, R.mipmap.image_1, R.raw.audio_of_image_1)
                                , builArticulationDataItem(R.string.అమ్మ, R.mipmap.image_2, R.raw.audio_of_image_2)
                                , builArticulationDataItem(R.string.అగ్గిపుల్ల, R.mipmap.image_3, R.raw.audio_of_image_3)
                                , builArticulationDataItem(R.string.అగ్ని, R.mipmap.image_4, R.raw.audio_of_image_4)
                                , builArticulationDataItem(R.string.అల, R.mipmap.image_5, R.raw.audio_of_image_5)
                                , builArticulationDataItem(R.string.అడుగులు, R.mipmap.image_6, R.raw.audio_of_image_6)
                                , builArticulationDataItem(R.string.అంగడి, R.mipmap.image_7, R.raw.audio_of_image_7)
                                , builArticulationDataItem(R.string.అద్దం, R.mipmap.image_8, R.raw.audio_of_image_8)
                                , builArticulationDataItem(R.string.అన్నం, R.mipmap.image_9, R.raw.audio_of_image_9))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 10 for ఆవు
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఆ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఆవు, R.mipmap.image_11, R.raw.audio_of_image_10)
                                , builArticulationDataItem(R.string.ఆకు, R.mipmap.image_11, R.raw.audio_of_image_11)
                                , builArticulationDataItem(R.string.ఆట, R.mipmap.image_12, R.raw.audio_of_image_12))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 15 for ఇసుక

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఇ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఇల్లు, R.mipmap.image_13, R.raw.audio_of_image_13)
                                , builArticulationDataItem(R.string.ఇటుక, R.mipmap.image_14, R.raw.audio_of_image_14)
                                , builArticulationDataItem(R.string.ఇసుక, R.mipmap.image_16, R.raw.audio_of_image_15)
                                , builArticulationDataItem(R.string.ఇత్తడి_దీపాలు, R.mipmap.image_16, R.raw.audio_of_image_16)
                                , builArticulationDataItem(R.string.ఇనుము, R.mipmap.image_17, R.raw.audio_of_image_17))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఈ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఈక, R.mipmap.image_18, R.raw.audio_of_image_18)
                                , builArticulationDataItem(R.string.ఈగ, R.mipmap.image_19, R.raw.audio_of_image_19)
                                , builArticulationDataItem(R.string.ఈతకాయ, R.mipmap.image_20, R.raw.audio_of_image_20)
                                , builArticulationDataItem(R.string.ఈత, R.mipmap.image_21, R.raw.audio_of_image_21))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 22 for ఉడుత

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఉ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఉడుత, R.mipmap.image_23, R.raw.audio_of_image_22)
                                , builArticulationDataItem(R.string.ఉంగరం, R.mipmap.image_23, R.raw.audio_of_image_23)
                                , builArticulationDataItem(R.string.ఉల్లిగడ్డ, R.mipmap.image_24, R.raw.audio_of_image_24))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 27 for ఊతప్పం

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఊ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఊయల, R.mipmap.image_25, R.raw.audio_of_image_25)
                                , builArticulationDataItem(R.string.ఊరు, R.mipmap.image_26, R.raw.audio_of_image_26)
                                , builArticulationDataItem(R.string.ఊతప్పం, R.mipmap.image_28, R.raw.audio_of_image_27))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 30 for కుర్చి , 33 for కుండ, 34 for కొంగ, 37 for కత్తెర, 45 for కాటుక, 48 for ఎలుక, 50 for కాకి, 53 for పార్కు

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.క
                        , buildInitialList(
                                builArticulationDataItem(R.string.కమలం, R.mipmap.image_28, R.raw.audio_of_image_28)
                                , builArticulationDataItem(R.string.కుక్క, R.mipmap.image_29, R.raw.audio_of_image_29)
                                , builArticulationDataItem(R.string.కుర్చి, R.mipmap.image_31, R.raw.audio_of_image_30)
                                , builArticulationDataItem(R.string.కారు, R.mipmap.image_31, R.raw.audio_of_image_31)
                                , builArticulationDataItem(R.string.కప్పు, R.mipmap.image_32, R.raw.audio_of_image_32)
                                , builArticulationDataItem(R.string.కుండ, R.mipmap.image_35, R.raw.audio_of_image_33)
                                , builArticulationDataItem(R.string.కొంగ, R.mipmap.image_35, R.raw.audio_of_image_34)
                                , builArticulationDataItem(R.string.కన్ను, R.mipmap.image_35, R.raw.audio_of_image_35)
                                , builArticulationDataItem(R.string.కత్తి, R.mipmap.image_36, R.raw.audio_of_image_36)
                                , builArticulationDataItem(R.string.కత్తెర, R.mipmap.image_38, R.raw.audio_of_image_37)
                                , builArticulationDataItem(R.string.కాకరకాయ, R.mipmap.image_38, R.raw.audio_of_image_38))
                        , buildMedialList(
                                builArticulationDataItem(R.string.చిక్కుడు_కాయ, R.mipmap.image_39, R.raw.audio_of_image_39)
                                , builArticulationDataItem(R.string.చక్కెర, R.mipmap.image_40, R.raw.audio_of_image_40)
                                , builArticulationDataItem(R.string.తక్కెడ, R.mipmap.image_41, R.raw.audio_of_image_41)
                                , builArticulationDataItem(R.string.తక్కెడ, R.mipmap.image_42, R.raw.audio_of_image_42)
                                , builArticulationDataItem(R.string.వంకాయ, R.mipmap.image_43, R.raw.audio_of_image_43))
                        , buildFinalList(
                                builArticulationDataItem(R.string.కిటికి, R.mipmap.image_44, R.raw.audio_of_image_44)
                                , builArticulationDataItem(R.string.కాటుక, R.mipmap.image_46, R.raw.audio_of_image_45)
                                , builArticulationDataItem(R.string.నక్క, R.mipmap.image_46, R.raw.audio_of_image_46)
                                , builArticulationDataItem(R.string.చాకు, R.mipmap.image_47, R.raw.audio_of_image_47)
                                , builArticulationDataItem(R.string.ఎలుక, R.mipmap.image_49, R.raw.audio_of_image_48)
                                , builArticulationDataItem(R.string.పలక, R.mipmap.image_49, R.raw.audio_of_image_49)
                                , builArticulationDataItem(R.string.కాకి, R.mipmap.image_51, R.raw.audio_of_image_50)
                                , builArticulationDataItem(R.string.జింక, R.mipmap.image_51, R.raw.audio_of_image_51)
                                , builArticulationDataItem(R.string.చొక్క, R.mipmap.image_52, R.raw.audio_of_image_52)
                                , builArticulationDataItem(R.string.పార్కు, R.mipmap.image_54, R.raw.audio_of_image_53)
                                , builArticulationDataItem(R.string.చిలుక, R.mipmap.image_54, R.raw.audio_of_image_54))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఖ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఖడ్గం, R.mipmap.image_55, R.raw.audio_of_image_55)
                                , builArticulationDataItem(R.string.ఖర్జూరము, R.mipmap.image_56, R.raw.audio_of_image_56))
                        , buildMedialList(
                                builArticulationDataItem(R.string.ముఖము, R.mipmap.image_57, R.raw.audio_of_image_57)
                                , builArticulationDataItem(R.string.శంఖం, R.mipmap.image_58, R.raw.audio_of_image_58))
                        , buildFinalList(
                                builArticulationDataItem(R.string.రాఖీ, R.mipmap.image_59, R.raw.audio_of_image_59))));

        //TODO request image 64 for గోడ, 65 for గవ్వలు, 68 for గుడి, 72 for కంగారూ, 79 for ముగ్గు
        //TODO request both image and audio resources for గాడిద
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.గ
                        , buildInitialList(
                                builArticulationDataItem(R.string.గుర్రము, R.mipmap.image_60, R.raw.audio_of_image_60)
                                , builArticulationDataItem(R.string.గడప, R.mipmap.image_61, R.raw.audio_of_image_61)
                                , builArticulationDataItem(R.string.గాడిద, R.mipmap.image_62, R.raw.audio_of_image_62)
                                , builArticulationDataItem(R.string.గంప, R.mipmap.image_62, R.raw.audio_of_image_62)
                                , builArticulationDataItem(R.string.గాజులు, R.mipmap.image_63, R.raw.audio_of_image_63)
                                , builArticulationDataItem(R.string.గోడ, R.mipmap.image_66, R.raw.audio_of_image_64)
                                , builArticulationDataItem(R.string.గవ్వలు, R.mipmap.image_66, R.raw.audio_of_image_65)
                                , builArticulationDataItem(R.string.గడియారము, R.mipmap.image_66, R.raw.audio_of_image_66)
                                , builArticulationDataItem(R.string.గేటు, R.mipmap.image_67, R.raw.audio_of_image_67)
                                , builArticulationDataItem(R.string.గుడి, R.mipmap.image_69, R.raw.audio_of_image_68)
                                , builArticulationDataItem(R.string.గొలుసు, R.mipmap.image_69, R.raw.audio_of_image_69))
                        , buildMedialList(
                                builArticulationDataItem(R.string.బంగారం, R.mipmap.image_70, R.raw.audio_of_image_70)
                                , builArticulationDataItem(R.string.రేగిపళ్లు, R.mipmap.image_71, R.raw.audio_of_image_71)
                                , builArticulationDataItem(R.string.కంగారూ, R.mipmap.image_73, R.raw.audio_of_image_72)
                                , builArticulationDataItem(R.string.పెంగ్విన్, R.mipmap.image_73, R.raw.audio_of_image_73)
                                , builArticulationDataItem(R.string.నగలు, R.mipmap.image_74, R.raw.audio_of_image_74)
                                , builArticulationDataItem(R.string.పుట్టగొడుగు, R.mipmap.image_75, R.raw.audio_of_image_75)
                                , builArticulationDataItem(R.string.మినుగురుపురుగు, R.mipmap.image_76, R.raw.audio_of_image_76))
                        , buildFinalList(
                                builArticulationDataItem(R.string.గొడుగు, R.mipmap.image_77, R.raw.audio_of_image_77)
                                , builArticulationDataItem(R.string.పాముపడగ, R.mipmap.image_78, R.raw.audio_of_image_78)
                                , builArticulationDataItem(R.string.ముగ్గు, R.mipmap.image_80, R.raw.audio_of_image_79)
                                , builArticulationDataItem(R.string.ఏనుగు, R.mipmap.image_80, R.raw.audio_of_image_80)
                                , builArticulationDataItem(R.string.బుడగ, R.mipmap.image_81, R.raw.audio_of_image_81)
                                , builArticulationDataItem(R.string.పెరుగు, R.mipmap.image_82, R.raw.audio_of_image_82)
                                , builArticulationDataItem(R.string.పిడుగు, R.mipmap.image_83, R.raw.audio_of_image_83))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఘ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఘంట, R.mipmap.image_84, R.raw.audio_of_image_84))
                        , buildMedialList()
                        , buildFinalList()));

        //TODO request image 88 for చీర, 89 for చెట్టు, 90 for చామంతి, 95 for చాట, 99 for చాట, 101 for చర్చ్

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.చ
                        , buildInitialList(
                                builArticulationDataItem(R.string.చాట, R.mipmap.image_85, R.raw.audio_of_image_85)
                                , builArticulationDataItem(R.string.చాక్లెట్, R.mipmap.image_86, R.raw.audio_of_image_86)
                                , builArticulationDataItem(R.string.చీపురు, R.mipmap.image_87, R.raw.audio_of_image_87)
                                , builArticulationDataItem(R.string.చీర, R.mipmap.image_84, R.raw.audio_of_image_88)
                                , builArticulationDataItem(R.string.చెట్టు, R.mipmap.image_84, R.raw.audio_of_image_89)
                                , builArticulationDataItem(R.string.చామంతి, R.mipmap.image_84, R.raw.audio_of_image_90)
                                , builArticulationDataItem(R.string.చక్రము, R.mipmap.image_91, R.raw.audio_of_image_91)
                                , builArticulationDataItem(R.string.చేప, R.mipmap.image_92, R.raw.audio_of_image_92)
                                , builArticulationDataItem(R.string.చాప, R.mipmap.image_93, R.raw.audio_of_image_93)
                                , builArticulationDataItem(R.string.చెవి, R.mipmap.image_94, R.raw.audio_of_image_94))
                        , buildMedialList(
                                builArticulationDataItem(R.string.చాట, R.mipmap.image_85, R.raw.audio_of_image_95)
                                , builArticulationDataItem(R.string.చాట, R.mipmap.image_96, R.raw.audio_of_image_96)
                                , builArticulationDataItem(R.string.చాట, R.mipmap.image_97, R.raw.audio_of_image_97)
                                , builArticulationDataItem(R.string.చాట, R.mipmap.image_98, R.raw.audio_of_image_98)
                                , builArticulationDataItem(R.string.చాట, R.mipmap.image_100, R.raw.audio_of_image_99))
                        , buildFinalList(
                                builArticulationDataItem(R.string.చెంచా, R.mipmap.image_100, R.raw.audio_of_image_100)
                                , builArticulationDataItem(R.string.చర్చ్, R.mipmap.image_85, R.raw.audio_of_image_101)
                                , builArticulationDataItem(R.string.సంచి, R.mipmap.image_102, R.raw.audio_of_image_102)
                                , builArticulationDataItem(R.string.మంచు, R.mipmap.image_103, R.raw.audio_of_image_103))));

        //TODO request image 104 to 199

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఛ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఛాతి, R.mipmap.image_84, R.raw.audio_of_image_104))
                        , buildMedialList(
                                builArticulationDataItem(R.string.పింఛము, R.mipmap.image_84, R.raw.audio_of_image_105)
                        )
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.జ
                        , buildInitialList(
                                builArticulationDataItem(R.string.జడ, R.mipmap.image_84, R.raw.audio_of_image_106)
                                , builArticulationDataItem(R.string.జామకాయ, R.mipmap.image_84, R.raw.audio_of_image_107)
                                , builArticulationDataItem(R.string.జపమాల, R.mipmap.image_84, R.raw.audio_of_image_108)
                                , builArticulationDataItem(R.string.జలము, R.mipmap.image_84, R.raw.audio_of_image_109)
                                , builArticulationDataItem(R.string.జిలకర్ర, R.mipmap.image_84, R.raw.audio_of_image_110)
                                , builArticulationDataItem(R.string.జెండా, R.mipmap.image_84, R.raw.audio_of_image_111)
                                , builArticulationDataItem(R.string.జీపు, R.mipmap.image_84, R.raw.audio_of_image_112)
                                , builArticulationDataItem(R.string.జల్లెడ, R.mipmap.image_84, R.raw.audio_of_image_113)
                                , builArticulationDataItem(R.string.జోకర్, R.mipmap.image_84, R.raw.audio_of_image_114)
                                , builArticulationDataItem(R.string.జున్ను, R.mipmap.image_84, R.raw.audio_of_image_115)
                                , builArticulationDataItem(R.string.జిప్, R.mipmap.image_84, R.raw.audio_of_image_116))
                        , buildMedialList(
                                builArticulationDataItem(R.string.పంజరం, R.mipmap.image_84, R.raw.audio_of_image_117)
                                , builArticulationDataItem(R.string.గజ్జెలు, R.mipmap.image_84, R.raw.audio_of_image_118))
                        , buildFinalList(
                                builArticulationDataItem(R.string.కోడిపుంజు, R.mipmap.image_84, R.raw.audio_of_image_119)
                                , builArticulationDataItem(R.string.రాజు, R.mipmap.image_84, R.raw.audio_of_image_120))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఝ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఝాన్సీ_రాణి, R.mipmap.image_84, R.raw.audio_of_image_121))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ట
                        , buildInitialList(
                                builArticulationDataItem(R.string.టీ_వి, R.mipmap.image_84, R.raw.audio_of_image_122)
                                , builArticulationDataItem(R.string.టార్చ్, R.mipmap.image_84, R.raw.audio_of_image_123)
                                , builArticulationDataItem(R.string.ట్రాక్టరు, R.mipmap.image_84, R.raw.audio_of_image_124)
                                , builArticulationDataItem(R.string.టేపు, R.mipmap.image_84, R.raw.audio_of_image_125))
                        , buildMedialList(
                                builArticulationDataItem(R.string.బాటిల్, R.mipmap.image_84, R.raw.audio_of_image_126)
                                , builArticulationDataItem(R.string.అటుకులు, R.mipmap.image_84, R.raw.audio_of_image_127)
                                , builArticulationDataItem(R.string.కిరీటం, R.mipmap.image_84, R.raw.audio_of_image_128)
                                , builArticulationDataItem(R.string.బిస్కెట్లు, R.mipmap.image_84, R.raw.audio_of_image_129))
                        , buildFinalList(
                                builArticulationDataItem(R.string.టమాట, R.mipmap.image_84, R.raw.audio_of_image_130)
                                , builArticulationDataItem(R.string.ప్లేటు, R.mipmap.image_84, R.raw.audio_of_image_131)
                                , builArticulationDataItem(R.string.జుట్టు, R.mipmap.image_84, R.raw.audio_of_image_132)
                                , builArticulationDataItem(R.string.బెల్ట్, R.mipmap.image_84, R.raw.audio_of_image_133)
                                , builArticulationDataItem(R.string.పొట్ట, R.mipmap.image_84, R.raw.audio_of_image_134)
                                , builArticulationDataItem(R.string.పెట్టె, R.mipmap.image_84, R.raw.audio_of_image_135)
                                , builArticulationDataItem(R.string.బూట్లు, R.mipmap.image_84, R.raw.audio_of_image_136)
                                , builArticulationDataItem(R.string.బొట్టు, R.mipmap.image_84, R.raw.audio_of_image_137))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఠ
                        , buildInitialList()
                        , buildMedialList(
                                builArticulationDataItem(R.string.కంఠం, R.mipmap.image_84, R.raw.audio_of_image_138)
                                , builArticulationDataItem(R.string.బఠాని, R.mipmap.image_84, R.raw.audio_of_image_139))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.డ
                        , buildInitialList(
                                builArticulationDataItem(R.string.డబ్బులు, R.mipmap.image_84, R.raw.audio_of_image_140)
                                , builArticulationDataItem(R.string.డప్పు, R.mipmap.image_84, R.raw.audio_of_image_141)
                                , builArticulationDataItem(R.string.గోడ_ఢ, R.mipmap.image_84, R.raw.audio_of_image_142)
                                , builArticulationDataItem(R.string.డోలు, R.mipmap.image_84, R.raw.audio_of_image_143)
                                , builArticulationDataItem(R.string.డబ్బా, R.mipmap.image_84, R.raw.audio_of_image_144))
                        , buildMedialList(
                                builArticulationDataItem(R.string.గడ్డం, R.mipmap.image_84, R.raw.audio_of_image_145)
                                , builArticulationDataItem(R.string.రేడియో, R.mipmap.image_84, R.raw.audio_of_image_146)
                                , builArticulationDataItem(R.string.కడియం, R.mipmap.image_84, R.raw.audio_of_image_147)
                                , builArticulationDataItem(R.string.పడవ, R.mipmap.image_84, R.raw.audio_of_image_148)
                                , builArticulationDataItem(R.string.గాడిద_ఢ, R.mipmap.image_84, R.raw.audio_of_image_149)
                                , builArticulationDataItem(R.string.అడవి, R.mipmap.image_84, R.raw.audio_of_image_150)
                        )
                        , buildFinalList(
                                builArticulationDataItem(R.string.చంద్రుడు, R.mipmap.image_84, R.raw.audio_of_image_151)
                                , builArticulationDataItem(R.string.గుడ్డు, R.mipmap.image_84, R.raw.audio_of_image_152)
                                , builArticulationDataItem(R.string.బోర్డు, R.mipmap.image_84, R.raw.audio_of_image_153)
                                , builArticulationDataItem(R.string.సోడా, R.mipmap.image_84, R.raw.audio_of_image_154)
                                , builArticulationDataItem(R.string.బ్లేడు, R.mipmap.image_84, R.raw.audio_of_image_155)
                                , builArticulationDataItem(R.string.చామగడ్డ, R.mipmap.image_84, R.raw.audio_of_image_156)
                                , builArticulationDataItem(R.string.దండ, R.mipmap.image_84, R.raw.audio_of_image_157)
                                , builArticulationDataItem(R.string.టెడ్డీ, R.mipmap.image_84, R.raw.audio_of_image_158)
                                , builArticulationDataItem(R.string.రోడ్డు, R.mipmap.image_84, R.raw.audio_of_image_159)
                                , builArticulationDataItem(R.string.బండి, R.mipmap.image_84, R.raw.audio_of_image_160)
                                , builArticulationDataItem(R.string.తొండ, R.mipmap.image_84, R.raw.audio_of_image_161))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఢ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఢమరుకం, R.mipmap.image_84, R.raw.audio_of_image_162))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.త
                        , buildInitialList(
                                builArticulationDataItem(R.string.తలుపు, R.mipmap.image_84, R.raw.audio_of_image_163)
                                , builArticulationDataItem(R.string.తాడు, R.mipmap.image_84, R.raw.audio_of_image_164)
                                , builArticulationDataItem(R.string.తొమ్మిది, R.mipmap.image_84, R.raw.audio_of_image_165)
                                , builArticulationDataItem(R.string.తోక, R.mipmap.image_84, R.raw.audio_of_image_166)
                                , builArticulationDataItem(R.string.తల, R.mipmap.image_84, R.raw.audio_of_image_167)
                                , builArticulationDataItem(R.string.తేనె, R.mipmap.image_84, R.raw.audio_of_image_168)
                                , builArticulationDataItem(R.string.తాబేలు, R.mipmap.image_84, R.raw.audio_of_image_169)
                                , builArticulationDataItem(R.string.తొట్టి, R.mipmap.image_84, R.raw.audio_of_image_170)
                                , builArticulationDataItem(R.string.తాత, R.mipmap.image_84, R.raw.audio_of_image_171)
                                , builArticulationDataItem(R.string.తూనీగ, R.mipmap.image_84, R.raw.audio_of_image_172))
                        , buildMedialList(
                                builArticulationDataItem(R.string.వంతెన, R.mipmap.image_84, R.raw.audio_of_image_173)
                                , builArticulationDataItem(R.string.పుస్తకము, R.mipmap.image_84, R.raw.audio_of_image_174)
                                , builArticulationDataItem(R.string.విత్తనం, R.mipmap.image_84, R.raw.audio_of_image_175)
                                , builArticulationDataItem(R.string.చింతకాయ, R.mipmap.image_84, R.raw.audio_of_image_176))
                        , buildFinalList(
                                builArticulationDataItem(R.string.మూత, R.mipmap.image_84, R.raw.audio_of_image_177)
                                , builArticulationDataItem(R.string.కోతి, R.mipmap.image_84, R.raw.audio_of_image_178)
                                , builArticulationDataItem(R.string.చిరుత, R.mipmap.image_84, R.raw.audio_of_image_179)
                                , builArticulationDataItem(R.string.చెత్త, R.mipmap.image_84, R.raw.audio_of_image_180))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ద
                        , buildInitialList(
                                builArticulationDataItem(R.string.దంతం, R.mipmap.image_84, R.raw.audio_of_image_181)
                                , builArticulationDataItem(R.string.దిండు, R.mipmap.image_84, R.raw.audio_of_image_182)
                                , builArticulationDataItem(R.string.దువ్వెన, R.mipmap.image_84, R.raw.audio_of_image_183)
                                , builArticulationDataItem(R.string.దారం, R.mipmap.image_84, R.raw.audio_of_image_184)
                                , builArticulationDataItem(R.string.దీపము, R.mipmap.image_84, R.raw.audio_of_image_185)
                                , builArticulationDataItem(R.string.దీపావళి, R.mipmap.image_84, R.raw.audio_of_image_186)
                                , builArticulationDataItem(R.string.దోమ, R.mipmap.image_84, R.raw.audio_of_image_187)
                                , builArticulationDataItem(R.string.దానిమ్మపండు, R.mipmap.image_84, R.raw.audio_of_image_188))
                        , buildMedialList(
                                builArticulationDataItem(R.string.మందారం, R.mipmap.image_84, R.raw.audio_of_image_189)
                                , builArticulationDataItem(R.string.కుందేలు, R.mipmap.image_84, R.raw.audio_of_image_190)
                                , builArticulationDataItem(R.string.కందిపప్పు, R.mipmap.image_84, R.raw.audio_of_image_191)
                                , builArticulationDataItem(R.string.కందగడ్డ, R.mipmap.image_84, R.raw.audio_of_image_192)
                                , builArticulationDataItem(R.string.కందీరీగ, R.mipmap.image_84, R.raw.audio_of_image_193)
                                , builArticulationDataItem(R.string.పందిరి, R.mipmap.image_84, R.raw.audio_of_image_194)
                                , builArticulationDataItem(R.string.పుదీన, R.mipmap.image_84, R.raw.audio_of_image_195))
                        , buildFinalList(
                                builArticulationDataItem(R.string.నది, R.mipmap.image_84, R.raw.audio_of_image_196)
                                , builArticulationDataItem(R.string.పంది, R.mipmap.image_84, R.raw.audio_of_image_197)
                                , builArticulationDataItem(R.string.వంద, R.mipmap.image_84, R.raw.audio_of_image_198))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ధ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ధనస్సు, R.mipmap.image_84, R.raw.audio_of_image_199)
                                , builArticulationDataItem(R.string.ధనలక్ష్మీ, R.mipmap.image_200, R.raw.audio_of_image_200))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.న
                        , buildInitialList(
                                builArticulationDataItem(R.string.నాలుక, R.mipmap.image_201, R.raw.audio_of_image_201)
                                , builArticulationDataItem(R.string.నాన్న, R.mipmap.image_202, R.raw.audio_of_image_202)
                                , builArticulationDataItem(R.string.నీరు, R.mipmap.image_203, R.raw.audio_of_image_203)
                                , builArticulationDataItem(R.string.నిమ్మకాయ, R.mipmap.image_204, R.raw.audio_of_image_204)
                                , builArticulationDataItem(R.string.నోరు, R.mipmap.image_205, R.raw.audio_of_image_205)
                                , builArticulationDataItem(R.string.నెమలి, R.mipmap.image_206, R.raw.audio_of_image_206)
                                , builArticulationDataItem(R.string.నాటకం, R.mipmap.image_207, R.raw.audio_of_image_207)
                                , builArticulationDataItem(R.string.నత్త, R.mipmap.image_208, R.raw.audio_of_image_208)
                                , builArticulationDataItem(R.string.నడుము, R.mipmap.image_209, R.raw.audio_of_image_209))
                        , buildMedialList(
                                builArticulationDataItem(R.string.తేనె_పట్టు, R.mipmap.image_210, R.raw.audio_of_image_210)
                                , builArticulationDataItem(R.string.వెన్నముద్ద, R.mipmap.image_211, R.raw.audio_of_image_211)
                                , builArticulationDataItem(R.string.పన్నీరు, R.mipmap.image_212, R.raw.audio_of_image_212)
                                , builArticulationDataItem(R.string.పానకం, R.mipmap.image_213, R.raw.audio_of_image_213))
                        , buildFinalList(
                                builArticulationDataItem(R.string.పన్ను, R.mipmap.image_214, R.raw.audio_of_image_214)
                                , builArticulationDataItem(R.string.నూనె, R.mipmap.image_215, R.raw.audio_of_image_215)
                                , builArticulationDataItem(R.string.ఫోను, R.mipmap.image_216, R.raw.audio_of_image_216)
                                , builArticulationDataItem(R.string.ఫ్యాను, R.mipmap.image_217, R.raw.audio_of_image_217)
                                , builArticulationDataItem(R.string.పెన్ను, R.mipmap.image_218, R.raw.audio_of_image_218))));
        // TODO request 227 audio of పేపరు
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ప
                        , buildInitialList(
                                builArticulationDataItem(R.string.పాము, R.mipmap.image_219, R.raw.audio_of_image_219)
                                , builArticulationDataItem(R.string.పళ్ళు, R.mipmap.image_220, R.raw.audio_of_image_220)
                                , builArticulationDataItem(R.string.పెనం, R.mipmap.image_221, R.raw.audio_of_image_221)
                                , builArticulationDataItem(R.string.పులిహోర, R.mipmap.image_222, R.raw.audio_of_image_222)
                                , builArticulationDataItem(R.string.పెన్సిలు, R.mipmap.image_223, R.raw.audio_of_image_223)
                                , builArticulationDataItem(R.string.పులి, R.mipmap.image_224, R.raw.audio_of_image_224)
                                , builArticulationDataItem(R.string.ప్యాంటు, R.mipmap.image_225, R.raw.audio_of_image_225)
                                , builArticulationDataItem(R.string.పేపరు, R.mipmap.image_226, R.raw.audio_of_image_227)
                                , builArticulationDataItem(R.string.పోలీసు, R.mipmap.image_227, R.raw.audio_of_image_227))
                        , buildMedialList(
                                builArticulationDataItem(R.string.మిరపకాయ, R.mipmap.image_228, R.raw.audio_of_image_228)
                                , builArticulationDataItem(R.string.రంపము, R.mipmap.image_229, R.raw.audio_of_image_229)
                                , builArticulationDataItem(R.string.గాలిపటం, R.mipmap.image_230, R.raw.audio_of_image_230)
                                , builArticulationDataItem(R.string.తుపాకి, R.mipmap.image_231, R.raw.audio_of_image_231))
                        , buildFinalList(
                                builArticulationDataItem(R.string.పాప, R.mipmap.image_232, R.raw.audio_of_image_232)
                                , builArticulationDataItem(R.string.పరుపు, R.mipmap.image_233, R.raw.audio_of_image_233)
                                , builArticulationDataItem(R.string.నలుపు, R.mipmap.image_234, R.raw.audio_of_image_234)
                                , builArticulationDataItem(R.string.బంగాళదుంప, R.mipmap.image_235, R.raw.audio_of_image_235))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఫ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఫలములు, R.mipmap.image_236, R.raw.audio_of_image_236)
                                , builArticulationDataItem(R.string.ఫిరంగి, R.mipmap.image_237, R.raw.audio_of_image_237)
                                , builArticulationDataItem(R.string.ఫ్లూటు, R.mipmap.image_238, R.raw.audio_of_image_238)
                                , builArticulationDataItem(R.string.ఫ్రిడ్జ్, R.mipmap.image_239, R.raw.audio_of_image_239))
                        , buildMedialList()
                        , buildFinalList(
                                builArticulationDataItem(R.string.సోఫా, R.mipmap.image_240, R.raw.audio_of_image_240)
                                , builArticulationDataItem(R.string.సెల్ఫీ, R.mipmap.image_241, R.raw.audio_of_image_241)
                                , builArticulationDataItem(R.string.జిరాఫి, R.mipmap.image_242, R.raw.audio_of_image_242))));
        //TODO image 256 for సబ్బు,

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.బ
                        , buildInitialList(
                                builArticulationDataItem(R.string.బల్ల, R.mipmap.image_243, R.raw.audio_of_image_243)
                                , builArticulationDataItem(R.string.బ్రష్, R.mipmap.image_244, R.raw.audio_of_image_244)
                                , builArticulationDataItem(R.string.బస్సు, R.mipmap.image_245, R.raw.audio_of_image_245)
                                , builArticulationDataItem(R.string.బాణం, R.mipmap.image_246, R.raw.audio_of_image_246)
                                , builArticulationDataItem(R.string.బంతి, R.mipmap.image_247, R.raw.audio_of_image_247)
                                , builArticulationDataItem(R.string.బల్లి, R.mipmap.image_248, R.raw.audio_of_image_248)
                                , builArticulationDataItem(R.string.బక్కెట్, R.mipmap.image_249, R.raw.audio_of_image_249)
                                , builArticulationDataItem(R.string.బలపం, R.mipmap.image_250, R.raw.audio_of_image_250)
                                , builArticulationDataItem(R.string.బీట్_రూట్, R.mipmap.image_251, R.raw.audio_of_image_251)
                                , builArticulationDataItem(R.string.బెల్లం, R.mipmap.image_252, R.raw.audio_of_image_252))
                        , buildMedialList(
                                builArticulationDataItem(R.string.తబల, R.mipmap.image_253, R.raw.audio_of_image_253)
                                , builArticulationDataItem(R.string.కొబ్బరి, R.mipmap.image_254, R.raw.audio_of_image_254)
                                , builArticulationDataItem(R.string.రబ్బరు, R.mipmap.image_255, R.raw.audio_of_image_255))
                        , buildFinalList(
                                builArticulationDataItem(R.string.సబ్బు, R.mipmap.image_257, R.raw.audio_of_image_256)
                                , builArticulationDataItem(R.string.బాబు, R.mipmap.image_257, R.raw.audio_of_image_257)
                                , builArticulationDataItem(R.string.చెంబు, R.mipmap.image_258, R.raw.audio_of_image_258))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.భ
                        , buildInitialList(
                                builArticulationDataItem(R.string.భరిణ, R.mipmap.image_259, R.raw.audio_of_image_259)
                                , builArticulationDataItem(R.string.భరతమాత, R.mipmap.image_260, R.raw.audio_of_image_260)
                                , builArticulationDataItem(R.string.భారతదేశం, R.mipmap.image_261, R.raw.audio_of_image_261)
                                , builArticulationDataItem(R.string.భోజనం, R.mipmap.image_262, R.raw.audio_of_image_262)
                                , builArticulationDataItem(R.string.భజన, R.mipmap.image_263, R.raw.audio_of_image_263))
                        , buildMedialList()
                        , buildFinalList()));
//TODO provide image 284 for పావురం, 283 for రథము, 277 for సిమెంటు, 268 for మేక
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.మ
                        , buildInitialList(
                                builArticulationDataItem(R.string.మామిడి, R.mipmap.image_264, R.raw.audio_of_image_264)
                                , builArticulationDataItem(R.string.మెట్లు, R.mipmap.image_265, R.raw.audio_of_image_265)
                                , builArticulationDataItem(R.string.మొగ్గ, R.mipmap.image_266, R.raw.audio_of_image_266)
                                , builArticulationDataItem(R.string.మల్లెపువ్వు, R.mipmap.image_267, R.raw.audio_of_image_267)
                                , builArticulationDataItem(R.string.మేక, R.mipmap.image_269, R.raw.audio_of_image_268)
                                , builArticulationDataItem(R.string.మొసలి, R.mipmap.image_269, R.raw.audio_of_image_269)
                                , builArticulationDataItem(R.string.మాల, R.mipmap.image_270, R.raw.audio_of_image_270)
                                , builArticulationDataItem(R.string.మెంతులు, R.mipmap.image_271, R.raw.audio_of_image_271)
                                , builArticulationDataItem(R.string.మీసం, R.mipmap.image_272, R.raw.audio_of_image_272))
                        , buildMedialList(
                                builArticulationDataItem(R.string.కెమెరా, R.mipmap.image_273, R.raw.audio_of_image_273)
                                , builArticulationDataItem(R.string.కొమ్ములు, R.mipmap.image_274, R.raw.audio_of_image_274)
                                , builArticulationDataItem(R.string.చీమలు, R.mipmap.image_275, R.raw.audio_of_image_275)
                                , builArticulationDataItem(R.string.తమలపాకు, R.mipmap.image_276, R.raw.audio_of_image_276)
                                , builArticulationDataItem(R.string.సిమెంటు, R.mipmap.image_278, R.raw.audio_of_image_277)
                                , builArticulationDataItem(R.string.కమలాపండు, R.mipmap.image_278, R.raw.audio_of_image_278))
                        , buildFinalList(
                                builArticulationDataItem(R.string.బొమ్మ, R.mipmap.image_279, R.raw.audio_of_image_279)
                                , builArticulationDataItem(R.string.పాదము, R.mipmap.image_280, R.raw.audio_of_image_280)
                                , builArticulationDataItem(R.string.కుంకుమ, R.mipmap.image_281, R.raw.audio_of_image_281)
                                , builArticulationDataItem(R.string.కోలాటం, R.mipmap.image_282, R.raw.audio_of_image_282)
                                , builArticulationDataItem(R.string.రథము, R.mipmap.image_285, R.raw.audio_of_image_283)
                                , builArticulationDataItem(R.string.పావురం, R.mipmap.image_285, R.raw.audio_of_image_284))));
//TODO image 293 for వడియాలు,
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.య
                        , buildInitialList(
                                builArticulationDataItem(R.string.యజ్ఞం, R.mipmap.image_285, R.raw.audio_of_image_285)
                                , builArticulationDataItem(R.string.యాభై, R.mipmap.image_286, R.raw.audio_of_image_286)
                                , builArticulationDataItem(R.string.యముడు, R.mipmap.image_287, R.raw.audio_of_image_287)
                                , builArticulationDataItem(R.string.యాలుకలు, R.mipmap.image_288, R.raw.audio_of_image_288)
                                , builArticulationDataItem(R.string.యుద్ధం, R.mipmap.image_289, R.raw.audio_of_image_289))
                        , buildMedialList(
                                builArticulationDataItem(R.string.దెయ్యం, R.mipmap.image_290, R.raw.audio_of_image_290)
                                , builArticulationDataItem(R.string.బియ్యం, R.mipmap.image_291, R.raw.audio_of_image_291)
                                , builArticulationDataItem(R.string.టపాకాయలు, R.mipmap.image_292, R.raw.audio_of_image_292)
                                , builArticulationDataItem(R.string.వడియాలు, R.mipmap.image_294, R.raw.audio_of_image_293))
                        , buildFinalList(
                                builArticulationDataItem(R.string.రుపాయి, R.mipmap.image_294, R.raw.audio_of_image_294)
                                , builArticulationDataItem(R.string.బీరకాయ, R.mipmap.image_295, R.raw.audio_of_image_295)
                                , builArticulationDataItem(R.string.మునక్కాయ, R.mipmap.image_296, R.raw.audio_of_image_296)
                                , builArticulationDataItem(R.string.సేమియా, R.mipmap.image_297, R.raw.audio_of_image_297))));

        //TODO provide 308 image for కర్ర, 305 for వజ్రాలు, 303 for రైలు, 299 for రంధ్రము
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ర
                        , buildInitialList(
                                builArticulationDataItem(R.string.రాయి, R.mipmap.image_298, R.raw.audio_of_image_298)
                                , builArticulationDataItem(R.string.రంధ్రము, R.mipmap.image_298, R.raw.audio_of_image_299)
                                , builArticulationDataItem(R.string.రెక్కలు, R.mipmap.image_300, R.raw.audio_of_image_300)
                                , builArticulationDataItem(R.string.రాత్రి, R.mipmap.image_301, R.raw.audio_of_image_301)
                                , builArticulationDataItem(R.string.రాణి, R.mipmap.image_302, R.raw.audio_of_image_302)
                                , builArticulationDataItem(R.string.రైలు, R.mipmap.image_302, R.raw.audio_of_image_303))
                        , buildMedialList(
                                builArticulationDataItem(R.string.బీరువా, R.mipmap.image_304, R.raw.audio_of_image_304)
                                , builArticulationDataItem(R.string.వజ్రాలు, R.mipmap.image_306, R.raw.audio_of_image_305)
                                , builArticulationDataItem(R.string.సిరా, R.mipmap.image_306, R.raw.audio_of_image_306)
                                , builArticulationDataItem(R.string.గరిట, R.mipmap.image_307, R.raw.audio_of_image_307))
                        , buildFinalList(
                                builArticulationDataItem(R.string.కర్ర, R.mipmap.image_309, R.raw.audio_of_image_308)
                                , builArticulationDataItem(R.string.కూర, R.mipmap.image_309, R.raw.audio_of_image_309)
                                , builArticulationDataItem(R.string.అలమర, R.mipmap.image_310, R.raw.audio_of_image_310)
                                , builArticulationDataItem(R.string.మర, R.mipmap.image_311, R.raw.audio_of_image_311)
                                , builArticulationDataItem(R.string.కారు_ర, R.mipmap.image_312, R.raw.audio_of_image_312)
                                , builArticulationDataItem(R.string.కంప్యూటర్, R.mipmap.image_313, R.raw.audio_of_image_313))));
//TODO provide 316 for లడ్డు,
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ల
                        , buildInitialList(
                                builArticulationDataItem(R.string.లైటు, R.mipmap.image_314, R.raw.audio_of_image_314)
                                , builArticulationDataItem(R.string.లాఠీ, R.mipmap.image_315, R.raw.audio_of_image_315)
                                , builArticulationDataItem(R.string.లాంతరు, R.mipmap.image_317, R.raw.audio_of_image_316)
                                , builArticulationDataItem(R.string.లడ్డు, R.mipmap.image_317, R.raw.audio_of_image_317)
                                , builArticulationDataItem(R.string.తల_ల, R.mipmap.image_318, R.raw.audio_of_image_318)
                                , builArticulationDataItem(R.string.లత, R.mipmap.image_319, R.raw.audio_of_image_319))
                        , buildMedialList(
                                builArticulationDataItem(R.string.గిలక, R.mipmap.image_320, R.raw.audio_of_image_320)
                                , builArticulationDataItem(R.string.అలారం, R.mipmap.image_321, R.raw.audio_of_image_321)
                                , builArticulationDataItem(R.string.అల్లం, R.mipmap.image_322, R.raw.audio_of_image_322)
                                , builArticulationDataItem(R.string.కొలను, R.mipmap.image_323, R.raw.audio_of_image_323))
                        , buildFinalList(
                                builArticulationDataItem(R.string.పాలు, R.mipmap.image_324, R.raw.audio_of_image_324)
                                , builArticulationDataItem(R.string.పిల్లి, R.mipmap.image_325, R.raw.audio_of_image_325)
                                , builArticulationDataItem(R.string.ఈల, R.mipmap.image_326, R.raw.audio_of_image_326)
                                , builArticulationDataItem(R.string.కాలు, R.mipmap.image_327, R.raw.audio_of_image_327)
                                , builArticulationDataItem(R.string.చేతులు, R.mipmap.image_328, R.raw.audio_of_image_328)
                                , builArticulationDataItem(R.string.వేళ్ళు, R.mipmap.image_329, R.raw.audio_of_image_329))));

//TODO provide 338 image for తువాలు, 335 for వీపు, 333 for వరి,

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.వ
                        , buildInitialList(
                                builArticulationDataItem(R.string.వర్షం, R.mipmap.image_330, R.raw.audio_of_image_330)
                                , builArticulationDataItem(R.string.వల, R.mipmap.image_331, R.raw.audio_of_image_331)
                                , builArticulationDataItem(R.string.వాము, R.mipmap.image_332, R.raw.audio_of_image_332)
                                , builArticulationDataItem(R.string.వరి, R.mipmap.image_334, R.raw.audio_of_image_333)
                                , builArticulationDataItem(R.string.వీణ, R.mipmap.image_334, R.raw.audio_of_image_334)
                                , builArticulationDataItem(R.string.వీపు, R.mipmap.image_336, R.raw.audio_of_image_335)
                                , builArticulationDataItem(R.string.వాచీ, R.mipmap.image_336, R.raw.audio_of_image_336))
                        , buildMedialList(
                                builArticulationDataItem(R.string.శివుడు, R.mipmap.image_337, R.raw.audio_of_image_337)
                                , builArticulationDataItem(R.string.తువాలు, R.mipmap.image_339, R.raw.audio_of_image_338)
                                , builArticulationDataItem(R.string.ఆవాలు, R.mipmap.image_339, R.raw.audio_of_image_339))
                        , buildFinalList(
                                builArticulationDataItem(R.string.శిలువ, R.mipmap.image_340, R.raw.audio_of_image_340)
                                , builArticulationDataItem(R.string.తాళంచెవి, R.mipmap.image_341, R.raw.audio_of_image_341)
                                , builArticulationDataItem(R.string.పొయ్యి, R.mipmap.image_342, R.raw.audio_of_image_342))));
//TODO provide 348 image for శిఖరం, 345 for శనగపిండి
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.శ
                        , buildInitialList(
                                builArticulationDataItem(R.string.శంఖం_శ, R.mipmap.image_343, R.raw.audio_of_image_343)
                                , builArticulationDataItem(R.string.శనగలు, R.mipmap.image_344, R.raw.audio_of_image_344)
                                , builArticulationDataItem(R.string.శనగపిండి, R.mipmap.image_346, R.raw.audio_of_image_345)
                                , builArticulationDataItem(R.string.శాలీడు, R.mipmap.image_346, R.raw.audio_of_image_346)
                                , builArticulationDataItem(R.string.శాలువ, R.mipmap.image_347, R.raw.audio_of_image_347)
                                , builArticulationDataItem(R.string.శిఖరం, R.mipmap.image_349, R.raw.audio_of_image_348))
                        , buildMedialList(
                                builArticulationDataItem(R.string.రాశులు, R.mipmap.image_349, R.raw.audio_of_image_349))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ష
                        , buildInitialList(
                                builArticulationDataItem(R.string.షర్టు, R.mipmap.image_350, R.raw.audio_of_image_350)
                                , builArticulationDataItem(R.string.షాంపూ, R.mipmap.image_351, R.raw.audio_of_image_351)
                                , builArticulationDataItem(R.string.షటిల్, R.mipmap.image_352, R.raw.audio_of_image_352)
                                , builArticulationDataItem(R.string.షూ, R.mipmap.image_353, R.raw.audio_of_image_353)
                                , builArticulationDataItem(R.string.షవర్, R.mipmap.image_354, R.raw.audio_of_image_354)
                                , builArticulationDataItem(R.string.షేవ్, R.mipmap.image_355, R.raw.audio_of_image_355))
                        , buildMedialList(
                                builArticulationDataItem(R.string.వేషం, R.mipmap.image_356, R.raw.audio_of_image_356)
                                , builArticulationDataItem(R.string.కాషాయం, R.mipmap.image_357, R.raw.audio_of_image_357)
                                , builArticulationDataItem(R.string.విషం, R.mipmap.image_358, R.raw.audio_of_image_358))
                        , buildFinalList(
                                builArticulationDataItem(R.string.గణేష్, R.mipmap.image_359, R.raw.audio_of_image_359))));

        //TODO provide image 371 for సరస్సు, 364 for సూప్, 361 for సేతు, 360 for సంత

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.స
                        , buildInitialList(
                                builArticulationDataItem(R.string.సంత, R.mipmap.image_362, R.raw.audio_of_image_360)
                                , builArticulationDataItem(R.string.సేతు, R.mipmap.image_362, R.raw.audio_of_image_361)
                                , builArticulationDataItem(R.string.సరుకు, R.mipmap.image_362, R.raw.audio_of_image_362)
                                , builArticulationDataItem(R.string.సూది, R.mipmap.image_363, R.raw.audio_of_image_363)
                                , builArticulationDataItem(R.string.సూప్, R.mipmap.image_365, R.raw.audio_of_image_364)
                                , builArticulationDataItem(R.string.సూట్, R.mipmap.image_365, R.raw.audio_of_image_365)
                                , builArticulationDataItem(R.string.సముద్రం, R.mipmap.image_366, R.raw.audio_of_image_366)
                                , builArticulationDataItem(R.string.సూర్యుడు, R.mipmap.image_367, R.raw.audio_of_image_367)
                                , builArticulationDataItem(R.string.సీతాఫలం, R.mipmap.image_368, R.raw.audio_of_image_368))
                        , buildMedialList(
                                builArticulationDataItem(R.string.పసుపు, R.mipmap.image_369, R.raw.audio_of_image_369)
                                , builArticulationDataItem(R.string.పనసపండు, R.mipmap.image_370, R.raw.audio_of_image_370))
                        , buildFinalList(
                                builArticulationDataItem(R.string.సరస్సు, R.mipmap.image_372, R.raw.audio_of_image_371)
                                , builArticulationDataItem(R.string.గ్లాసు, R.mipmap.image_372, R.raw.audio_of_image_372)
                                , builArticulationDataItem(R.string.నర్సు, R.mipmap.image_373, R.raw.audio_of_image_373)
                                , builArticulationDataItem(R.string.సాస్, R.mipmap.image_374, R.raw.audio_of_image_374)
                                , builArticulationDataItem(R.string.పరుసు, R.mipmap.image_375, R.raw.audio_of_image_375))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.హ
                        , buildInitialList(
                                builArticulationDataItem(R.string.హారతి, R.mipmap.image_376, R.raw.audio_of_image_376)
                                , builArticulationDataItem(R.string.హరం, R.mipmap.image_377, R.raw.audio_of_image_377)
                                , builArticulationDataItem(R.string.హంస, R.mipmap.image_378, R.raw.audio_of_image_378)
                                , builArticulationDataItem(R.string.హల్వ, R.mipmap.image_379, R.raw.audio_of_image_379)
                                , builArticulationDataItem(R.string.హంగర్, R.mipmap.image_380, R.raw.audio_of_image_380)
                                , builArticulationDataItem(R.string.హెలికాప్టర్, R.mipmap.image_381, R.raw.audio_of_image_381))
                        , buildMedialList(
                                builArticulationDataItem(R.string.సింహం, R.mipmap.image_382, R.raw.audio_of_image_382))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ళ
                        , buildInitialList()
                        , buildMedialList(
                                builArticulationDataItem(R.string.తాళం, R.mipmap.image_383, R.raw.audio_of_image_383)
                                , builArticulationDataItem(R.string.పెళ్ళి, R.mipmap.image_384, R.raw.audio_of_image_384)
                                , builArticulationDataItem(R.string.తాళి, R.mipmap.image_385, R.raw.audio_of_image_385))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.క్ష
                        , buildInitialList(
                                builArticulationDataItem(R.string.క్షవరంక్ష, R.mipmap.image_386, R.raw.audio_of_image_386)
                                , builArticulationDataItem(R.string.క్షత్రియుడు, R.mipmap.image_387, R.raw.audio_of_image_387))
                        , buildMedialList()
                        , buildFinalList(
                                builArticulationDataItem(R.string.శిక్ష, R.mipmap.image_388, R.raw.audio_of_image_388)
                                , builArticulationDataItem(R.string.రిక్షా, R.mipmap.image_389, R.raw.audio_of_image_389)
                                , builArticulationDataItem(R.string.బిక్ష, R.mipmap.image_390, R.raw.audio_of_image_390))));
    }

    private ArrayList<ArticulationDataItem> buildArticulationDataItemList(ArticulationDataItem... articulationDataItems) {
        return new ArrayList<>(Arrays.asList(articulationDataItems));
    }

    private ArrayList<ArticulationDataItem> buildInitialList(ArticulationDataItem... articulationDataItems) {
        return buildArticulationDataItemList(articulationDataItems);
    }

    private ArrayList<ArticulationDataItem> buildMedialList(ArticulationDataItem... articulationDataItems) {
        return buildArticulationDataItemList(articulationDataItems);
    }

    private ArrayList<ArticulationDataItem> buildFinalList(ArticulationDataItem... articulationDataItems) {
        return buildArticulationDataItemList(articulationDataItems);
    }

    private ArticulationData builArticulationData(int letterId, ArrayList<ArticulationDataItem> initialList, ArrayList<ArticulationDataItem> medialList, ArrayList<ArticulationDataItem> finalList) {
        return new ArticulationData.Builder().setLetterId(letterId)
                .setInitialList(initialList)
                .setMedialList(medialList)
                .setFinalList(finalList)
                .build();

    }

    private ArticulationDataItem builArticulationDataItem(int letterId, int imageid, int audioId) {
        return new ArticulationDataItem.Builder().setLetterId(letterId)
                .setAudioId(audioId)
                .setImageId(imageid)
                .build();

    }

}
