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
                                builArticulationDataItem(R.string.అరటి_పండు, R.drawable.image_1, R.raw.audio_of_image_1)
                                , builArticulationDataItem(R.string.అమ్మ, R.drawable.image_2, R.raw.audio_of_image_2)
                                , builArticulationDataItem(R.string.అగ్గిపుల్ల, R.drawable.image_3, R.raw.audio_of_image_3)
                                , builArticulationDataItem(R.string.అగ్ని, R.drawable.image_4, R.raw.audio_of_image_4)
                                , builArticulationDataItem(R.string.అల, R.drawable.image_5, R.raw.audio_of_image_5)
                                , builArticulationDataItem(R.string.అడుగులు, R.drawable.image_6, R.raw.audio_of_image_6)
                                , builArticulationDataItem(R.string.అంగడి, R.drawable.image_7, R.raw.audio_of_image_7)
                                , builArticulationDataItem(R.string.అద్దం, R.drawable.image_8, R.raw.audio_of_image_8)
                                , builArticulationDataItem(R.string.అన్నం, R.drawable.image_9, R.raw.audio_of_image_9))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 10 for ఆవు
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఆ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఆవు, R.drawable.image_10, R.raw.audio_of_image_10)
                                , builArticulationDataItem(R.string.ఆకు, R.drawable.image_11, R.raw.audio_of_image_11)
                                , builArticulationDataItem(R.string.ఆట, R.drawable.image_12, R.raw.audio_of_image_12))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 15 for ఇసుక

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఇ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఇల్లు, R.drawable.image_13, R.raw.audio_of_image_13)
                                , builArticulationDataItem(R.string.ఇటుక, R.drawable.image_14, R.raw.audio_of_image_14)
                                , builArticulationDataItem(R.string.ఇసుక, R.drawable.image_15, R.raw.audio_of_image_15)
                                , builArticulationDataItem(R.string.ఇత్తడి_దీపాలు, R.drawable.image_16, R.raw.audio_of_image_16)
                                , builArticulationDataItem(R.string.ఇనుము, R.drawable.image_17, R.raw.audio_of_image_17))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఈ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఈక, R.drawable.image_18, R.raw.audio_of_image_18)
                                , builArticulationDataItem(R.string.ఈగ, R.drawable.image_19, R.raw.audio_of_image_19)
                                , builArticulationDataItem(R.string.ఈతకాయ, R.drawable.image_20, R.raw.audio_of_image_20)
                                , builArticulationDataItem(R.string.ఈత, R.drawable.image_21, R.raw.audio_of_image_21))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 22 for ఉడుత

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఉ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఉడుత, R.drawable.image_22, R.raw.audio_of_image_22)
                                , builArticulationDataItem(R.string.ఉంగరం, R.drawable.image_23, R.raw.audio_of_image_23)
                                , builArticulationDataItem(R.string.ఉల్లిగడ్డ, R.drawable.image_24, R.raw.audio_of_image_24))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 27 for ఊతప్పం

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఊ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఊయల, R.drawable.image_25, R.raw.audio_of_image_25)
                                , builArticulationDataItem(R.string.ఊరు, R.drawable.image_26, R.raw.audio_of_image_26)
                                , builArticulationDataItem(R.string.ఊతప్పం, R.drawable.image_27, R.raw.audio_of_image_27))
                        , buildMedialList()
                        , buildFinalList()));
        //TODO request image 30 for కుర్చి , 33 for కుండ, 34 for కొంగ, 37 for కత్తెర, 45 for కాటుక, 48 for ఎలుక, 50 for కాకి, 53 for పార్కు

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.క
                        , buildInitialList(
                                builArticulationDataItem(R.string.కమలం, R.drawable.image_28, R.raw.audio_of_image_28)
                                , builArticulationDataItem(R.string.కుక్క, R.drawable.image_29, R.raw.audio_of_image_29)
                                , builArticulationDataItem(R.string.కుర్చి, R.drawable.image_30, R.raw.audio_of_image_30)
                                , builArticulationDataItem(R.string.కారు, R.drawable.image_31, R.raw.audio_of_image_31)
                                , builArticulationDataItem(R.string.కప్పు, R.drawable.image_32, R.raw.audio_of_image_32)
                                , builArticulationDataItem(R.string.కుండ, R.drawable.image_33, R.raw.audio_of_image_33)
                                , builArticulationDataItem(R.string.కొంగ, R.drawable.image_34, R.raw.audio_of_image_34)
                                , builArticulationDataItem(R.string.కన్ను, R.drawable.image_35, R.raw.audio_of_image_35)
                                , builArticulationDataItem(R.string.కత్తి, R.drawable.image_36, R.raw.audio_of_image_36)
                                , builArticulationDataItem(R.string.కత్తెర, R.drawable.image_37, R.raw.audio_of_image_37)
                                , builArticulationDataItem(R.string.కాకరకాయ, R.drawable.image_38, R.raw.audio_of_image_38))
                        , buildMedialList(
                                builArticulationDataItem(R.string.చిక్కుడు_కాయ, R.drawable.image_39, R.raw.audio_of_image_39)
                                , builArticulationDataItem(R.string.చక్కెర, R.drawable.image_40, R.raw.audio_of_image_40)
                                , builArticulationDataItem(R.string.తక్కెడ, R.drawable.image_41, R.raw.audio_of_image_41)
                                , builArticulationDataItem(R.string.తక్కెడ, R.drawable.image_42, R.raw.audio_of_image_42)
                                , builArticulationDataItem(R.string.వంకాయ, R.drawable.image_43, R.raw.audio_of_image_43))
                        , buildFinalList(
                                builArticulationDataItem(R.string.కిటికి, R.drawable.image_44, R.raw.audio_of_image_44)
                                , builArticulationDataItem(R.string.కాటుక, R.drawable.image_45, R.raw.audio_of_image_45)
                                , builArticulationDataItem(R.string.నక్క, R.drawable.image_46, R.raw.audio_of_image_46)
                                , builArticulationDataItem(R.string.చాకు, R.drawable.image_47, R.raw.audio_of_image_47)
                                , builArticulationDataItem(R.string.ఎలుక, R.drawable.image_48, R.raw.audio_of_image_48)
                                , builArticulationDataItem(R.string.పలక, R.drawable.image_49, R.raw.audio_of_image_49)
                                , builArticulationDataItem(R.string.కాకి, R.drawable.image_50, R.raw.audio_of_image_50)
                                , builArticulationDataItem(R.string.జింక, R.drawable.image_51, R.raw.audio_of_image_51)
                                , builArticulationDataItem(R.string.చొక్క, R.drawable.image_52, R.raw.audio_of_image_52)
                                , builArticulationDataItem(R.string.పార్కు, R.drawable.image_53, R.raw.audio_of_image_53)
                                , builArticulationDataItem(R.string.చిలుక, R.drawable.image_54, R.raw.audio_of_image_54))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఖ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఖడ్గం, R.drawable.image_55, R.raw.audio_of_image_55)
                                , builArticulationDataItem(R.string.ఖర్జూరము, R.drawable.image_56, R.raw.audio_of_image_56))
                        , buildMedialList(
                                builArticulationDataItem(R.string.ముఖము, R.drawable.image_57, R.raw.audio_of_image_57)
                                , builArticulationDataItem(R.string.శంఖం, R.drawable.image_58, R.raw.audio_of_image_58))
                        , buildFinalList(
                                builArticulationDataItem(R.string.రాఖీ, R.drawable.image_59, R.raw.audio_of_image_59))));

        //TODO request image 64 for గోడ, 65 for గవ్వలు, 68 for గుడి, 72 for కంగారూ, 79 for ముగ్గు
        //TODO request both image and audio resources for గాడిద
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.గ
                        , buildInitialList(
                                builArticulationDataItem(R.string.గుర్రము, R.drawable.image_60, R.raw.audio_of_image_60)
                                , builArticulationDataItem(R.string.గడప, R.drawable.image_61, R.raw.audio_of_image_61)
//                                , builArticulationDataItem(R.string.గాడిద, R.drawable.image_62, R.raw.audio_of_image_62)
                                , builArticulationDataItem(R.string.గంప, R.drawable.image_62, R.raw.audio_of_image_62)
                                , builArticulationDataItem(R.string.గాజులు, R.drawable.image_63, R.raw.audio_of_image_63)
                                , builArticulationDataItem(R.string.గోడ, R.drawable.image_64, R.raw.audio_of_image_64)
                                , builArticulationDataItem(R.string.గవ్వలు, R.drawable.image_65, R.raw.audio_of_image_65)
                                , builArticulationDataItem(R.string.గడియారము, R.drawable.image_66, R.raw.audio_of_image_66)
                                , builArticulationDataItem(R.string.గేటు, R.drawable.image_67, R.raw.audio_of_image_67)
                                , builArticulationDataItem(R.string.గుడి, R.drawable.image_68, R.raw.audio_of_image_68)
                                , builArticulationDataItem(R.string.గొలుసు, R.drawable.image_69, R.raw.audio_of_image_69))
                        , buildMedialList(
                                builArticulationDataItem(R.string.బంగారం, R.drawable.image_70, R.raw.audio_of_image_70)
                                , builArticulationDataItem(R.string.రేగిపళ్లు, R.drawable.image_71, R.raw.audio_of_image_71)
                                , builArticulationDataItem(R.string.కంగారూ, R.drawable.image_72, R.raw.audio_of_image_72)
                                , builArticulationDataItem(R.string.పెంగ్విన్, R.drawable.image_73, R.raw.audio_of_image_73)
                                , builArticulationDataItem(R.string.నగలు, R.drawable.image_74, R.raw.audio_of_image_74)
                                , builArticulationDataItem(R.string.పుట్టగొడుగు, R.drawable.image_75, R.raw.audio_of_image_75)
                                , builArticulationDataItem(R.string.మినుగురుపురుగు, R.drawable.image_76, R.raw.audio_of_image_76))
                        , buildFinalList(
                                builArticulationDataItem(R.string.గొడుగు, R.drawable.image_77, R.raw.audio_of_image_77)
                                , builArticulationDataItem(R.string.పాముపడగ, R.drawable.image_78, R.raw.audio_of_image_78)
                                , builArticulationDataItem(R.string.ముగ్గు, R.drawable.image_79, R.raw.audio_of_image_79)
                                , builArticulationDataItem(R.string.ఏనుగు, R.drawable.image_80, R.raw.audio_of_image_80)
                                , builArticulationDataItem(R.string.బుడగ, R.drawable.image_81, R.raw.audio_of_image_81)
                                , builArticulationDataItem(R.string.పెరుగు, R.drawable.image_82, R.raw.audio_of_image_82)
                                , builArticulationDataItem(R.string.పిడుగు, R.drawable.image_83, R.raw.audio_of_image_83))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఘ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఘంట, R.drawable.image_84, R.raw.audio_of_image_84))
                        , buildMedialList()
                        , buildFinalList()));

        //TODO request image 88 for చీర, 89 for చెట్టు, 90 for చామంతి, 95 for చాట, 99 for చాట, 101 for చర్చ్

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.చ
                        , buildInitialList(
                                builArticulationDataItem(R.string.చాట, R.drawable.image_85, R.raw.audio_of_image_85)
                                , builArticulationDataItem(R.string.చాక్లెట్, R.drawable.image_86, R.raw.audio_of_image_86)
                                , builArticulationDataItem(R.string.చీపురు, R.drawable.image_87, R.raw.audio_of_image_87)
                                , builArticulationDataItem(R.string.చీర, R.drawable.image_88, R.raw.audio_of_image_88)
                                , builArticulationDataItem(R.string.చెట్టు, R.drawable.image_89, R.raw.audio_of_image_89)
                                , builArticulationDataItem(R.string.చామంతి, R.drawable.image_90, R.raw.audio_of_image_90)
                                , builArticulationDataItem(R.string.చక్రము, R.drawable.image_91, R.raw.audio_of_image_91)
                                , builArticulationDataItem(R.string.చేప, R.drawable.image_92, R.raw.audio_of_image_92)
                                , builArticulationDataItem(R.string.చాప, R.drawable.image_93, R.raw.audio_of_image_93)
                                , builArticulationDataItem(R.string.చెవి, R.drawable.image_94, R.raw.audio_of_image_94))
                        , buildMedialList(
                                builArticulationDataItem(R.string.చాట, R.drawable.image_95, R.raw.audio_of_image_95)
                                , builArticulationDataItem(R.string.చాట, R.drawable.image_96, R.raw.audio_of_image_96)
                                , builArticulationDataItem(R.string.చాట, R.drawable.image_97, R.raw.audio_of_image_97)
                                , builArticulationDataItem(R.string.చాట, R.drawable.image_98, R.raw.audio_of_image_98)
                                , builArticulationDataItem(R.string.చాట, R.drawable.image_99, R.raw.audio_of_image_99))
                        , buildFinalList(
                                builArticulationDataItem(R.string.చెంచా, R.drawable.image_100, R.raw.audio_of_image_100)
                                , builArticulationDataItem(R.string.చర్చ్, R.drawable.image_101, R.raw.audio_of_image_101)
                                , builArticulationDataItem(R.string.సంచి, R.drawable.image_102, R.raw.audio_of_image_102)
                                , builArticulationDataItem(R.string.మంచు, R.drawable.image_103, R.raw.audio_of_image_103))));

        //TODO request image 104 to 199

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఛ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఛాతి, R.drawable.image_104, R.raw.audio_of_image_104))
                        , buildMedialList(
                                builArticulationDataItem(R.string.పింఛము, R.drawable.image_105, R.raw.audio_of_image_105)
                        )
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.జ
                        , buildInitialList(
                                builArticulationDataItem(R.string.జడ, R.drawable.image_106, R.raw.audio_of_image_106)
                                , builArticulationDataItem(R.string.జామకాయ, R.drawable.image_107, R.raw.audio_of_image_107)
                                , builArticulationDataItem(R.string.జపమాల, R.drawable.image_108, R.raw.audio_of_image_108)
                                , builArticulationDataItem(R.string.జలము, R.drawable.image_109, R.raw.audio_of_image_109)
                                , builArticulationDataItem(R.string.జిలకర్ర, R.drawable.image_110, R.raw.audio_of_image_110)
                                , builArticulationDataItem(R.string.జెండా, R.drawable.image_111, R.raw.audio_of_image_111)
                                , builArticulationDataItem(R.string.జీపు, R.drawable.image_112, R.raw.audio_of_image_112)
                                , builArticulationDataItem(R.string.జల్లెడ, R.drawable.image_113, R.raw.audio_of_image_113)
                                , builArticulationDataItem(R.string.జోకర్, R.drawable.image_114, R.raw.audio_of_image_114)
                                , builArticulationDataItem(R.string.జున్ను, R.drawable.image_115, R.raw.audio_of_image_115)
                                , builArticulationDataItem(R.string.జిప్, R.drawable.image_116, R.raw.audio_of_image_116))
                        , buildMedialList(
                                builArticulationDataItem(R.string.పంజరం, R.drawable.image_117, R.raw.audio_of_image_117)
                                , builArticulationDataItem(R.string.గజ్జెలు, R.drawable.image_118, R.raw.audio_of_image_118))
                        , buildFinalList(
                                builArticulationDataItem(R.string.కోడిపుంజు, R.drawable.image_119, R.raw.audio_of_image_119)
                                , builArticulationDataItem(R.string.రాజు, R.drawable.image_120, R.raw.audio_of_image_120))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఝ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఝాన్సీ_రాణి, R.drawable.image_121, R.raw.audio_of_image_121))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ట
                        , buildInitialList(
                                builArticulationDataItem(R.string.టీ_వి, R.drawable.image_122, R.raw.audio_of_image_122)
                                , builArticulationDataItem(R.string.టార్చ్, R.drawable.image_123, R.raw.audio_of_image_123)
                                , builArticulationDataItem(R.string.ట్రాక్టరు, R.drawable.image_124, R.raw.audio_of_image_124)
                                , builArticulationDataItem(R.string.టేపు, R.drawable.image_125, R.raw.audio_of_image_125))
                        , buildMedialList(
                                builArticulationDataItem(R.string.బాటిల్, R.drawable.image_126, R.raw.audio_of_image_126)
                                , builArticulationDataItem(R.string.అటుకులు, R.drawable.image_127, R.raw.audio_of_image_127)
                                , builArticulationDataItem(R.string.కిరీటం, R.drawable.image_128, R.raw.audio_of_image_128)
                                , builArticulationDataItem(R.string.బిస్కెట్లు, R.drawable.image_129, R.raw.audio_of_image_129))
                        , buildFinalList(
                                builArticulationDataItem(R.string.టమాట, R.drawable.image_130, R.raw.audio_of_image_130)
                                , builArticulationDataItem(R.string.ప్లేటు, R.drawable.image_131, R.raw.audio_of_image_131)
                                , builArticulationDataItem(R.string.జుట్టు, R.drawable.image_132, R.raw.audio_of_image_132)
                                , builArticulationDataItem(R.string.బెల్ట్, R.drawable.image_133, R.raw.audio_of_image_133)
                                , builArticulationDataItem(R.string.పొట్ట, R.drawable.image_134, R.raw.audio_of_image_134)
                                , builArticulationDataItem(R.string.పెట్టె, R.drawable.image_135, R.raw.audio_of_image_135)
                                , builArticulationDataItem(R.string.బూట్లు, R.drawable.image_136, R.raw.audio_of_image_136)
                                , builArticulationDataItem(R.string.బొట్టు, R.drawable.image_137, R.raw.audio_of_image_137))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఠ
                        , buildInitialList()
                        , buildMedialList(
                                builArticulationDataItem(R.string.కంఠం, R.drawable.image_138, R.raw.audio_of_image_138)
                                , builArticulationDataItem(R.string.బఠాని, R.drawable.image_139, R.raw.audio_of_image_139))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.డ
                        , buildInitialList(
                                builArticulationDataItem(R.string.డబ్బులు, R.drawable.image_140, R.raw.audio_of_image_140)
                                , builArticulationDataItem(R.string.డప్పు, R.drawable.image_141, R.raw.audio_of_image_141)
                                , builArticulationDataItem(R.string.గోడ_ఢ, R.drawable.image_142, R.raw.audio_of_image_142)
                                , builArticulationDataItem(R.string.డోలు, R.drawable.image_143, R.raw.audio_of_image_143)
                                , builArticulationDataItem(R.string.డబ్బా, R.drawable.image_144, R.raw.audio_of_image_144))
                        , buildMedialList(
                                builArticulationDataItem(R.string.గడ్డం, R.drawable.image_145, R.raw.audio_of_image_145)
                                , builArticulationDataItem(R.string.రేడియో, R.drawable.image_146, R.raw.audio_of_image_146)
                                , builArticulationDataItem(R.string.కడియం, R.drawable.image_147, R.raw.audio_of_image_147)
                                , builArticulationDataItem(R.string.పడవ, R.drawable.image_148, R.raw.audio_of_image_148)
                                , builArticulationDataItem(R.string.గాడిద_ఢ, R.drawable.image_149, R.raw.audio_of_image_149)
                                , builArticulationDataItem(R.string.అడవి, R.drawable.image_150, R.raw.audio_of_image_150)
                        )
                        , buildFinalList(
                                builArticulationDataItem(R.string.చంద్రుడు, R.drawable.image_151, R.raw.audio_of_image_151)
                                , builArticulationDataItem(R.string.గుడ్డు, R.drawable.image_152, R.raw.audio_of_image_152)
                                , builArticulationDataItem(R.string.బోర్డు, R.drawable.image_153, R.raw.audio_of_image_153)
                                , builArticulationDataItem(R.string.సోడా, R.drawable.image_154, R.raw.audio_of_image_154)
                                , builArticulationDataItem(R.string.బ్లేడు, R.drawable.image_155, R.raw.audio_of_image_155)
                                , builArticulationDataItem(R.string.చామగడ్డ, R.drawable.image_156, R.raw.audio_of_image_156)
                                , builArticulationDataItem(R.string.దండ, R.drawable.image_157, R.raw.audio_of_image_157)
                                , builArticulationDataItem(R.string.టెడ్డీ, R.drawable.image_158, R.raw.audio_of_image_158)
                                , builArticulationDataItem(R.string.రోడ్డు, R.drawable.image_159, R.raw.audio_of_image_159)
                                , builArticulationDataItem(R.string.బండి, R.drawable.image_160, R.raw.audio_of_image_160)
                                , builArticulationDataItem(R.string.తొండ, R.drawable.image_161, R.raw.audio_of_image_161))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఢ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఢమరుకం, R.drawable.image_162, R.raw.audio_of_image_162))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.త
                        , buildInitialList(
                                builArticulationDataItem(R.string.తలుపు, R.drawable.image_163, R.raw.audio_of_image_163)
                                , builArticulationDataItem(R.string.తాడు, R.drawable.image_164, R.raw.audio_of_image_164)
                                , builArticulationDataItem(R.string.తొమ్మిది, R.drawable.image_165, R.raw.audio_of_image_165)
                                , builArticulationDataItem(R.string.తోక, R.drawable.image_166, R.raw.audio_of_image_166)
                                , builArticulationDataItem(R.string.తల, R.drawable.image_167, R.raw.audio_of_image_167)
                                , builArticulationDataItem(R.string.తేనె, R.drawable.image_168, R.raw.audio_of_image_168)
                                , builArticulationDataItem(R.string.తాబేలు, R.drawable.image_169, R.raw.audio_of_image_169)
                                , builArticulationDataItem(R.string.తొట్టి, R.drawable.image_170, R.raw.audio_of_image_170)
                                , builArticulationDataItem(R.string.తాత, R.drawable.image_171, R.raw.audio_of_image_171)
                                , builArticulationDataItem(R.string.తూనీగ, R.drawable.image_172, R.raw.audio_of_image_172))
                        , buildMedialList(
                                builArticulationDataItem(R.string.వంతెన, R.drawable.image_173, R.raw.audio_of_image_173)
                                , builArticulationDataItem(R.string.పుస్తకము, R.drawable.image_174, R.raw.audio_of_image_174)
                                , builArticulationDataItem(R.string.విత్తనం, R.drawable.image_175, R.raw.audio_of_image_175)
                                , builArticulationDataItem(R.string.చింతకాయ, R.drawable.image_176, R.raw.audio_of_image_176))
                        , buildFinalList(
                                builArticulationDataItem(R.string.మూత, R.drawable.image_177, R.raw.audio_of_image_177)
                                , builArticulationDataItem(R.string.కోతి, R.drawable.image_178, R.raw.audio_of_image_178)
                                , builArticulationDataItem(R.string.చిరుత, R.drawable.image_179, R.raw.audio_of_image_179)
                                , builArticulationDataItem(R.string.చెత్త, R.drawable.image_180, R.raw.audio_of_image_180))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ద
                        , buildInitialList(
                                builArticulationDataItem(R.string.దంతం, R.drawable.image_181, R.raw.audio_of_image_181)
                                , builArticulationDataItem(R.string.దిండు, R.drawable.image_182, R.raw.audio_of_image_182)
                                , builArticulationDataItem(R.string.దువ్వెన, R.drawable.image_183, R.raw.audio_of_image_183)
                                , builArticulationDataItem(R.string.దారం, R.drawable.image_184, R.raw.audio_of_image_184)
                                , builArticulationDataItem(R.string.దీపము, R.drawable.image_185, R.raw.audio_of_image_185)
                                , builArticulationDataItem(R.string.దీపావళి, R.drawable.image_186, R.raw.audio_of_image_186)
                                , builArticulationDataItem(R.string.దోమ, R.drawable.image_187, R.raw.audio_of_image_187)
                                , builArticulationDataItem(R.string.దానిమ్మపండు, R.drawable.image_188, R.raw.audio_of_image_188))
                        , buildMedialList(
                                builArticulationDataItem(R.string.మందారం, R.drawable.image_189, R.raw.audio_of_image_189)
                                , builArticulationDataItem(R.string.కుందేలు, R.drawable.image_190, R.raw.audio_of_image_190)
                                , builArticulationDataItem(R.string.కందిపప్పు, R.drawable.image_191, R.raw.audio_of_image_191)
                                , builArticulationDataItem(R.string.కందగడ్డ, R.drawable.image_192, R.raw.audio_of_image_192)
                                , builArticulationDataItem(R.string.కందీరీగ, R.drawable.image_193, R.raw.audio_of_image_193)
                                , builArticulationDataItem(R.string.పందిరి, R.drawable.image_194, R.raw.audio_of_image_194)
                                , builArticulationDataItem(R.string.పుదీన, R.drawable.image_195, R.raw.audio_of_image_195))
                        , buildFinalList(
                                builArticulationDataItem(R.string.నది, R.drawable.image_196, R.raw.audio_of_image_196)
                                , builArticulationDataItem(R.string.పంది, R.drawable.image_197, R.raw.audio_of_image_197)
                                , builArticulationDataItem(R.string.వంద, R.drawable.image_198, R.raw.audio_of_image_198))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ధ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ధనస్సు, R.drawable.image_199, R.raw.audio_of_image_199)
                                , builArticulationDataItem(R.string.ధనలక్ష్మీ, R.drawable.image_200, R.raw.audio_of_image_200))
                        , buildMedialList()
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.న
                        , buildInitialList(
                                builArticulationDataItem(R.string.నాలుక, R.drawable.image_201, R.raw.audio_of_image_201)
                                , builArticulationDataItem(R.string.నాన్న, R.drawable.image_202, R.raw.audio_of_image_202)
                                , builArticulationDataItem(R.string.నీరు, R.drawable.image_203, R.raw.audio_of_image_203)
                                , builArticulationDataItem(R.string.నిమ్మకాయ, R.drawable.image_204, R.raw.audio_of_image_204)
                                , builArticulationDataItem(R.string.నోరు, R.drawable.image_205, R.raw.audio_of_image_205)
                                , builArticulationDataItem(R.string.నెమలి, R.drawable.image_206, R.raw.audio_of_image_206)
                                , builArticulationDataItem(R.string.నాటకం, R.drawable.image_207, R.raw.audio_of_image_207)
                                , builArticulationDataItem(R.string.నత్త, R.drawable.image_208, R.raw.audio_of_image_208)
                                , builArticulationDataItem(R.string.నడుము, R.drawable.image_209, R.raw.audio_of_image_209))
                        , buildMedialList(
                                builArticulationDataItem(R.string.తేనె_పట్టు, R.drawable.image_210, R.raw.audio_of_image_210)
                                , builArticulationDataItem(R.string.వెన్నముద్ద, R.drawable.image_211, R.raw.audio_of_image_211)
                                , builArticulationDataItem(R.string.పన్నీరు, R.drawable.image_212, R.raw.audio_of_image_212)
                                , builArticulationDataItem(R.string.పానకం, R.drawable.image_213, R.raw.audio_of_image_213))
                        , buildFinalList(
                                builArticulationDataItem(R.string.పన్ను, R.drawable.image_214, R.raw.audio_of_image_214)
                                , builArticulationDataItem(R.string.నూనె, R.drawable.image_215, R.raw.audio_of_image_215)
                                , builArticulationDataItem(R.string.ఫోను, R.drawable.image_216, R.raw.audio_of_image_216)
                                , builArticulationDataItem(R.string.ఫ్యాను, R.drawable.image_217, R.raw.audio_of_image_217)
                                , builArticulationDataItem(R.string.పెన్ను, R.drawable.image_218, R.raw.audio_of_image_218))));
        // TODO request 227 audio of పేపరు
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ప
                        , buildInitialList(
                                builArticulationDataItem(R.string.పాము, R.drawable.image_219, R.raw.audio_of_image_219)
                                , builArticulationDataItem(R.string.పళ్ళు, R.drawable.image_220, R.raw.audio_of_image_220)
                                , builArticulationDataItem(R.string.పెనం, R.drawable.image_221, R.raw.audio_of_image_221)
                                , builArticulationDataItem(R.string.పులిహోర, R.drawable.image_222, R.raw.audio_of_image_222)
                                , builArticulationDataItem(R.string.పెన్సిలు, R.drawable.image_223, R.raw.audio_of_image_223)
                                , builArticulationDataItem(R.string.పులి, R.drawable.image_224, R.raw.audio_of_image_224)
                                , builArticulationDataItem(R.string.ప్యాంటు, R.drawable.image_225, R.raw.audio_of_image_225)
                                , builArticulationDataItem(R.string.పేపరు, R.drawable.image_226, R.raw.audio_of_image_226)
                                , builArticulationDataItem(R.string.పోలీసు, R.drawable.image_227, R.raw.audio_of_image_227))
                        , buildMedialList(
                                builArticulationDataItem(R.string.మిరపకాయ, R.drawable.image_228, R.raw.audio_of_image_228)
                                , builArticulationDataItem(R.string.రంపము, R.drawable.image_229, R.raw.audio_of_image_229)
                                , builArticulationDataItem(R.string.గాలిపటం, R.drawable.image_230, R.raw.audio_of_image_230)
                                , builArticulationDataItem(R.string.తుపాకి, R.drawable.image_231, R.raw.audio_of_image_231))
                        , buildFinalList(
                                builArticulationDataItem(R.string.పాప, R.drawable.image_232, R.raw.audio_of_image_232)
                                , builArticulationDataItem(R.string.పరుపు, R.drawable.image_233, R.raw.audio_of_image_233)
                                , builArticulationDataItem(R.string.నలుపు, R.drawable.image_234, R.raw.audio_of_image_234)
                                , builArticulationDataItem(R.string.బంగాళదుంప, R.drawable.image_235, R.raw.audio_of_image_235))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ఫ
                        , buildInitialList(
                                builArticulationDataItem(R.string.ఫలములు, R.drawable.image_236, R.raw.audio_of_image_237)
                                , builArticulationDataItem(R.string.ఫిరంగి, R.drawable.image_237, R.raw.audio_of_image_238)
                                , builArticulationDataItem(R.string.ఫ్లూటు, R.drawable.image_238, R.raw.audio_of_image_239)
                                , builArticulationDataItem(R.string.ఫ్రిడ్జ్, R.drawable.image_239, R.raw.audio_of_image_240))
                        , buildMedialList()
                        , buildFinalList(
                                builArticulationDataItem(R.string.సోఫా, R.drawable.image_240, R.raw.audio_of_image_241)
                                , builArticulationDataItem(R.string.సెల్ఫీ, R.drawable.image_241, R.raw.audio_of_image_242)
                                , builArticulationDataItem(R.string.జిరాఫి, R.drawable.image_242, R.raw.audio_of_image_243))));
        //TODO image 256 for సబ్బు,

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.బ
                        , buildInitialList(
                                builArticulationDataItem(R.string.బల్ల, R.drawable.image_243, R.raw.audio_of_image_244)
                                , builArticulationDataItem(R.string.బ్రష్, R.drawable.image_244, R.raw.audio_of_image_245)
                                , builArticulationDataItem(R.string.బస్సు, R.drawable.image_245, R.raw.audio_of_image_246)
                                , builArticulationDataItem(R.string.బాణం, R.drawable.image_246, R.raw.audio_of_image_247)
                                , builArticulationDataItem(R.string.బంతి, R.drawable.image_247, R.raw.audio_of_image_248)
                                , builArticulationDataItem(R.string.బల్లి, R.drawable.image_248, R.raw.audio_of_image_249)
                                , builArticulationDataItem(R.string.బక్కెట్, R.drawable.image_249, R.raw.audio_of_image_250)
                                , builArticulationDataItem(R.string.బలపం, R.drawable.image_250, R.raw.audio_of_image_251)
                                , builArticulationDataItem(R.string.బీట్_రూట్, R.drawable.image_251, R.raw.audio_of_image_252)
                                , builArticulationDataItem(R.string.బెల్లం, R.drawable.image_252, R.raw.audio_of_image_253))
                        , buildMedialList(
                                builArticulationDataItem(R.string.తబల, R.drawable.image_253, R.raw.audio_of_image_254)
                                , builArticulationDataItem(R.string.కొబ్బరి, R.drawable.image_254, R.raw.audio_of_image_255)
                                , builArticulationDataItem(R.string.రబ్బరు, R.drawable.image_255, R.raw.audio_of_image_256))
                        , buildFinalList(
                                builArticulationDataItem(R.string.సబ్బు, R.drawable.image_256, R.raw.audio_of_image_257)
                                , builArticulationDataItem(R.string.బాబు, R.drawable.image_257, R.raw.audio_of_image_258)
                                , builArticulationDataItem(R.string.చెంబు, R.drawable.image_258, R.raw.audio_of_image_259))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.భ
                        , buildInitialList(
                                builArticulationDataItem(R.string.భరిణ, R.drawable.image_259, R.raw.audio_of_image_260)
                                , builArticulationDataItem(R.string.భరతమాత, R.drawable.image_260, R.raw.audio_of_image_261)
                                , builArticulationDataItem(R.string.భారతదేశం, R.drawable.image_261, R.raw.audio_of_image_262)
                                , builArticulationDataItem(R.string.భోజనం, R.drawable.image_262, R.raw.audio_of_image_263)
                                , builArticulationDataItem(R.string.భజన, R.drawable.image_263, R.raw.audio_of_image_264))
                        , buildMedialList()
                        , buildFinalList()));
//TODO provide image 284 for పావురం, 283 for రథము, 277 for సిమెంటు, 268 for మేక
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.మ
                        , buildInitialList(
                                builArticulationDataItem(R.string.మామిడి, R.drawable.image_264, R.raw.audio_of_image_265)
                                , builArticulationDataItem(R.string.మెట్లు, R.drawable.image_265, R.raw.audio_of_image_266)
                                , builArticulationDataItem(R.string.మొగ్గ, R.drawable.image_266, R.raw.audio_of_image_267)
                                , builArticulationDataItem(R.string.మల్లెపువ్వు, R.drawable.image_267, R.raw.audio_of_image_268)
                                , builArticulationDataItem(R.string.మేక, R.drawable.image_268, R.raw.audio_of_image_269)
                                , builArticulationDataItem(R.string.మొసలి, R.drawable.image_269, R.raw.audio_of_image_270)
                                , builArticulationDataItem(R.string.మాల, R.drawable.image_270, R.raw.audio_of_image_271)
                                , builArticulationDataItem(R.string.మెంతులు, R.drawable.image_271, R.raw.audio_of_image_272)
                                , builArticulationDataItem(R.string.మీసం, R.drawable.image_272, R.raw.audio_of_image_273))
                        , buildMedialList(
                                builArticulationDataItem(R.string.కెమెరా, R.drawable.image_273, R.raw.audio_of_image_274)
                                , builArticulationDataItem(R.string.కొమ్ములు, R.drawable.image_274, R.raw.audio_of_image_275)
                                , builArticulationDataItem(R.string.చీమలు, R.drawable.image_275, R.raw.audio_of_image_276)
                                , builArticulationDataItem(R.string.తమలపాకు, R.drawable.image_276, R.raw.audio_of_image_277)
                                , builArticulationDataItem(R.string.సిమెంటు, R.drawable.image_277, R.raw.audio_of_image_278)
                                , builArticulationDataItem(R.string.కమలాపండు, R.drawable.image_278, R.raw.audio_of_image_279))
                        , buildFinalList(
                                builArticulationDataItem(R.string.బొమ్మ, R.drawable.image_279, R.raw.audio_of_image_280)
                                , builArticulationDataItem(R.string.పాదము, R.drawable.image_280, R.raw.audio_of_image_281)
                                , builArticulationDataItem(R.string.కుంకుమ, R.drawable.image_281, R.raw.audio_of_image_282)
                                , builArticulationDataItem(R.string.కోలాటం, R.drawable.image_282, R.raw.audio_of_image_283)
                                , builArticulationDataItem(R.string.రథము, R.drawable.image_283, R.raw.audio_of_image_284)
                                , builArticulationDataItem(R.string.పావురం, R.drawable.image_284, R.raw.audio_of_image_286))));
//TODO image 293 for వడియాలు,
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.య
                        , buildInitialList(
                                builArticulationDataItem(R.string.యజ్ఞం, R.drawable.image_285, R.raw.audio_of_image_287)
                                , builArticulationDataItem(R.string.యాభై, R.drawable.image_286, R.raw.audio_of_image_288)
                                , builArticulationDataItem(R.string.యముడు, R.drawable.image_287, R.raw.audio_of_image_289)
                                , builArticulationDataItem(R.string.యాలుకలు, R.drawable.image_288, R.raw.audio_of_image_290)
                                , builArticulationDataItem(R.string.యుద్ధం, R.drawable.image_289, R.raw.audio_of_image_291))
                        , buildMedialList(
                                builArticulationDataItem(R.string.దెయ్యం, R.drawable.image_290, R.raw.audio_of_image_292)
                                , builArticulationDataItem(R.string.బియ్యం, R.drawable.image_291, R.raw.audio_of_image_293)
                                , builArticulationDataItem(R.string.టపాకాయలు, R.drawable.image_292, R.raw.audio_of_image_294)
                                , builArticulationDataItem(R.string.వడియాలు, R.drawable.image_293, R.raw.audio_of_image_295))
                        , buildFinalList(
                                builArticulationDataItem(R.string.రుపాయి, R.drawable.image_294, R.raw.audio_of_image_296)
                                , builArticulationDataItem(R.string.బీరకాయ, R.drawable.image_295, R.raw.audio_of_image_297)
                                , builArticulationDataItem(R.string.మునక్కాయ, R.drawable.image_296, R.raw.audio_of_image_298)
                                , builArticulationDataItem(R.string.సేమియా, R.drawable.image_297, R.raw.audio_of_image_299))));

        //TODO provide 308 image for కర్ర, 305 for వజ్రాలు, 303 for రైలు, 299 for రంధ్రము
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ర
                        , buildInitialList(
                                builArticulationDataItem(R.string.రాయి, R.drawable.image_298, R.raw.audio_of_image_300)
                                , builArticulationDataItem(R.string.రంధ్రము, R.drawable.image_299, R.raw.audio_of_image_301)
                                , builArticulationDataItem(R.string.రెక్కలు, R.drawable.image_300, R.raw.audio_of_image_302)
                                , builArticulationDataItem(R.string.రాత్రి, R.drawable.image_301, R.raw.audio_of_image_303)
                                , builArticulationDataItem(R.string.రాణి, R.drawable.image_302, R.raw.audio_of_image_304)
                                , builArticulationDataItem(R.string.రైలు, R.drawable.image_303, R.raw.audio_of_image_305))
                        , buildMedialList(
                                builArticulationDataItem(R.string.బీరువా, R.drawable.image_304, R.raw.audio_of_image_306)
                                , builArticulationDataItem(R.string.వజ్రాలు, R.drawable.image_305, R.raw.audio_of_image_307)
//                                , builArticulationDataItem(R.string.సిరా, R.drawable.image_306, R.raw.audio_of_image_308)
                                , builArticulationDataItem(R.string.గరిట, R.drawable.image_307, R.raw.audio_of_image_308))
                        , buildFinalList(
                                builArticulationDataItem(R.string.కర్ర, R.drawable.image_308, R.raw.audio_of_image_309)
                                , builArticulationDataItem(R.string.కూర, R.drawable.image_309, R.raw.audio_of_image_310)
                                , builArticulationDataItem(R.string.అలమర, R.drawable.image_310, R.raw.audio_of_image_311)
                                , builArticulationDataItem(R.string.మర, R.drawable.image_311, R.raw.audio_of_image_312)
                                , builArticulationDataItem(R.string.కారు_ర, R.drawable.image_312, R.raw.audio_of_image_313)
                                , builArticulationDataItem(R.string.కంప్యూటర్, R.drawable.image_313, R.raw.audio_of_image_314))));
//TODO provide 316 for లడ్డు,
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ల
                        , buildInitialList(
                                builArticulationDataItem(R.string.లైటు, R.drawable.image_314, R.raw.audio_of_image_315)
                                , builArticulationDataItem(R.string.లాఠీ, R.drawable.image_315, R.raw.audio_of_image_316)
                                , builArticulationDataItem(R.string.లాంతరు, R.drawable.image_316, R.raw.audio_of_image_317)
                                , builArticulationDataItem(R.string.లడ్డు, R.drawable.image_317, R.raw.audio_of_image_318)
//                                , builArticulationDataItem(R.string.తల_ల, R.drawable.image_318, R.raw.audio_of_image_319)
                                , builArticulationDataItem(R.string.లత, R.drawable.image_319, R.raw.audio_of_image_320))
                        , buildMedialList(
                                builArticulationDataItem(R.string.గిలక, R.drawable.image_320, R.raw.audio_of_image_321)
                                , builArticulationDataItem(R.string.అలారం, R.drawable.image_321, R.raw.audio_of_image_322)
                                , builArticulationDataItem(R.string.అల్లం, R.drawable.image_322, R.raw.audio_of_image_323)
                                , builArticulationDataItem(R.string.కొలను, R.drawable.image_323, R.raw.audio_of_image_324))
                        , buildFinalList(
                                builArticulationDataItem(R.string.పాలు, R.drawable.image_324, R.raw.audio_of_image_325)
                                , builArticulationDataItem(R.string.పిల్లి, R.drawable.image_325, R.raw.audio_of_image_326)
                                , builArticulationDataItem(R.string.ఈల, R.drawable.image_326, R.raw.audio_of_image_327)
                                , builArticulationDataItem(R.string.కాలు, R.drawable.image_327, R.raw.audio_of_image_328)
                                , builArticulationDataItem(R.string.చేతులు, R.drawable.image_328, R.raw.audio_of_image_329)
                                , builArticulationDataItem(R.string.వేళ్ళు, R.drawable.image_329, R.raw.audio_of_image_330))));

//TODO provide 338 image for తువాలు, 335 for వీపు, 333 for వరి,

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.వ
                        , buildInitialList(
                                builArticulationDataItem(R.string.వర్షం, R.drawable.image_330, R.raw.audio_of_image_331)
                                , builArticulationDataItem(R.string.వల, R.drawable.image_331, R.raw.audio_of_image_332)
                                , builArticulationDataItem(R.string.వాము, R.drawable.image_332, R.raw.audio_of_image_333)
                                , builArticulationDataItem(R.string.వరి, R.drawable.image_333, R.raw.audio_of_image_334)
                                , builArticulationDataItem(R.string.వీణ, R.drawable.image_334, R.raw.audio_of_image_335)
                                , builArticulationDataItem(R.string.వీపు, R.drawable.image_335, R.raw.audio_of_image_336)
                                , builArticulationDataItem(R.string.వాచీ, R.drawable.image_336, R.raw.audio_of_image_337))
                        , buildMedialList(
                                builArticulationDataItem(R.string.శివుడు, R.drawable.image_337, R.raw.audio_of_image_338)
                                , builArticulationDataItem(R.string.తువాలు, R.drawable.image_338, R.raw.audio_of_image_339)
                                , builArticulationDataItem(R.string.ఆవాలు, R.drawable.image_339, R.raw.audio_of_image_340))
                        , buildFinalList(
                                builArticulationDataItem(R.string.శిలువ, R.drawable.image_340, R.raw.audio_of_image_341)
                                , builArticulationDataItem(R.string.తాళంచెవి, R.drawable.image_341, R.raw.audio_of_image_342)
                                , builArticulationDataItem(R.string.పొయ్యి, R.drawable.image_342, R.raw.audio_of_image_343))));
//TODO provide 348 image for శిఖరం, 345 for శనగపిండి
        articulationDataArrayList.add(
                builArticulationData(
                        R.string.శ
                        , buildInitialList(
                                builArticulationDataItem(R.string.శంఖం_శ, R.drawable.image_343, R.raw.audio_of_image_344)
                                , builArticulationDataItem(R.string.శనగలు, R.drawable.image_344, R.raw.audio_of_image_345)
                                , builArticulationDataItem(R.string.శనగపిండి, R.drawable.image_345, R.raw.audio_of_image_346)
                                , builArticulationDataItem(R.string.శాలీడు, R.drawable.image_346, R.raw.audio_of_image_347)
                                , builArticulationDataItem(R.string.శాలువ, R.drawable.image_347, R.raw.audio_of_image_348)
                                , builArticulationDataItem(R.string.శిఖరం, R.drawable.image_348, R.raw.audio_of_image_349))
                        , buildMedialList(
                                builArticulationDataItem(R.string.రాశులు, R.drawable.image_349, R.raw.audio_of_image_350))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ష
                        , buildInitialList(
                                builArticulationDataItem(R.string.షర్టు, R.drawable.image_350, R.raw.audio_of_image_351)
                                , builArticulationDataItem(R.string.షాంపూ, R.drawable.image_351, R.raw.audio_of_image_352)
                                , builArticulationDataItem(R.string.షటిల్, R.drawable.image_352, R.raw.audio_of_image_353)
                                , builArticulationDataItem(R.string.షూ, R.drawable.image_353, R.raw.audio_of_image_354)
                                , builArticulationDataItem(R.string.షవర్, R.drawable.image_354, R.raw.audio_of_image_355)
                                , builArticulationDataItem(R.string.షేవ్, R.drawable.image_355, R.raw.audio_of_image_356))
                        , buildMedialList(
                                builArticulationDataItem(R.string.వేషం, R.drawable.image_356, R.raw.audio_of_image_357)
                                , builArticulationDataItem(R.string.కాషాయం, R.drawable.image_357, R.raw.audio_of_image_358)
                                , builArticulationDataItem(R.string.విషం, R.drawable.image_358, R.raw.audio_of_image_359))
                        , buildFinalList(
                                builArticulationDataItem(R.string.గణేష్, R.drawable.image_359, R.raw.audio_of_image_360))));

        //TODO provide image 371 for సరస్సు, 364 for సూప్, 361 for సేతు, 360 for సంత

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.స
                        , buildInitialList(
                                builArticulationDataItem(R.string.సంత, R.drawable.image_360, R.raw.audio_of_image_361)
                                , builArticulationDataItem(R.string.సేతు, R.drawable.image_361, R.raw.audio_of_image_362)
                                , builArticulationDataItem(R.string.సరుకు, R.drawable.image_362, R.raw.audio_of_image_363)
                                , builArticulationDataItem(R.string.సూది, R.drawable.image_363, R.raw.audio_of_image_364)
                                , builArticulationDataItem(R.string.సూప్, R.drawable.image_364, R.raw.audio_of_image_365)
                                , builArticulationDataItem(R.string.సూట్, R.drawable.image_365, R.raw.audio_of_image_366)
                                , builArticulationDataItem(R.string.సముద్రం, R.drawable.image_366, R.raw.audio_of_image_367)
                                , builArticulationDataItem(R.string.సూర్యుడు, R.drawable.image_367, R.raw.audio_of_image_368)
                                , builArticulationDataItem(R.string.సీతాఫలం, R.drawable.image_368, R.raw.audio_of_image_369))
                        , buildMedialList(
                                builArticulationDataItem(R.string.పసుపు, R.drawable.image_369, R.raw.audio_of_image_370)
                                , builArticulationDataItem(R.string.పనసపండు, R.drawable.image_370, R.raw.audio_of_image_371))
                        , buildFinalList(
                                builArticulationDataItem(R.string.సరస్సు, R.drawable.image_371, R.raw.audio_of_image_372)
                                , builArticulationDataItem(R.string.గ్లాసు, R.drawable.image_372, R.raw.audio_of_image_373)
                                , builArticulationDataItem(R.string.నర్సు, R.drawable.image_373, R.raw.audio_of_image_374)
                                , builArticulationDataItem(R.string.సాస్, R.drawable.image_374, R.raw.audio_of_image_375)
                                , builArticulationDataItem(R.string.పరుసు, R.drawable.image_375, R.raw.audio_of_image_376))));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.హ
                        , buildInitialList(
                                builArticulationDataItem(R.string.హారతి, R.drawable.image_376, R.raw.audio_of_image_377)
                                , builArticulationDataItem(R.string.హరం, R.drawable.image_377, R.raw.audio_of_image_378)
                                , builArticulationDataItem(R.string.హంస, R.drawable.image_378, R.raw.audio_of_image_379)
                                , builArticulationDataItem(R.string.హల్వ, R.drawable.image_379, R.raw.audio_of_image_380)
                                , builArticulationDataItem(R.string.హంగర్, R.drawable.image_380, R.raw.audio_of_image_381)
                                , builArticulationDataItem(R.string.హెలికాప్టర్, R.drawable.image_381, R.raw.audio_of_image_382))
                        , buildMedialList(
                                builArticulationDataItem(R.string.సింహం, R.drawable.image_382, R.raw.audio_of_image_383))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.ళ
                        , buildInitialList()
                        , buildMedialList(
                                builArticulationDataItem(R.string.తాళం, R.drawable.image_383, R.raw.audio_of_image_384)
                                , builArticulationDataItem(R.string.పెళ్ళి, R.drawable.image_384, R.raw.audio_of_image_385)
                                , builArticulationDataItem(R.string.తాళి, R.drawable.image_385, R.raw.audio_of_image_386))
                        , buildFinalList()));

        articulationDataArrayList.add(
                builArticulationData(
                        R.string.క్ష
                        , buildInitialList(
                                builArticulationDataItem(R.string.క్షవరంక్ష, R.drawable.image_386, R.raw.audio_of_image_387)
                                , builArticulationDataItem(R.string.క్షత్రియుడు, R.drawable.image_387, R.raw.audio_of_image_388))
                        , buildMedialList()
                        , buildFinalList(
                                builArticulationDataItem(R.string.శిక్ష, R.drawable.image_388, R.raw.audio_of_image_389)
                                , builArticulationDataItem(R.string.రిక్షా, R.drawable.image_389, R.raw.audio_of_image_390)
                                , builArticulationDataItem(R.string.బిక్ష, R.drawable.image_390, R.raw.audio_of_image_391))));
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
