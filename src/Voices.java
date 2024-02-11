import java.util.List;

public class Voices {

    private static final FiltersVoice GUION_EDU = new FiltersVoice("GUION(EDU)",
            "/GUIONES",
            List.of("GUION","EDU"),
            List.of("ORIGINAL")
    );
    private static final FiltersVoice GUION_ORIGINAL = new FiltersVoice("GUION(ORIGINAL)",
            "/GUIONES",
            List.of("GUION","ORIGINAL"),
            List.of("EDU")
    );
    private static final FiltersVoice PRIMERA_CORNETA_GRANDE = new FiltersVoice("1CORNETA(GUION)",
            "/1CORNETA",
            List.of("1CORNE","GRANDE"),
            List.of("FUERT","PIAN","QUINT","APOY")
    );
    private static final FiltersVoice PRIMERA_CORNETA_FUERTE_A = new FiltersVoice("1CORNETA(FUERTE)(A)",
            "/1CORNETA",
            List.of("1CORNE","FUERTE"),
             List.of("GRANDE","(B")
    );
    private static final FiltersVoice PRIMERA_CORNETA_FUERTE_B = new FiltersVoice("1CORNETA(FUERTE)(B)",
            "/1CORNETA",
            List.of("1CORNE","FUERTE"),
            List.of("GRANDE","(A")
    );
    private static final FiltersVoice PRIMERA_CORNETA_PIANO_A = new FiltersVoice("1CORNETA(PIANO)(A)",
            "/1CORNETA",
            List.of("1CORNE","PIAN"),
            List.of("GRANDE","(B")
    );
    private static final FiltersVoice PRIMERA_CORNETA_PIANO_B = new FiltersVoice("1CORNETA(PIANO)(B)",
            "/1CORNETA",
            List.of("1CORNE","PIAN"),
            List.of("GRANDE","(A")
    );
    private static final FiltersVoice PRIMERA_CORNETA_QUINTO_A = new FiltersVoice("1CORNETA(QUINTO)(A)",
            "/1CORNETA",
            List.of("1CORNE","QUINT"),
            List.of("GRANDE","(B")
    );
    private static final FiltersVoice PRIMERA_CORNETA_QUINTO_B = new FiltersVoice("1CORNETA(QUINTO)(B)",
            "/1CORNETA",
            List.of("1CORNE","QUINT"),
            List.of("GRANDE","(A")
    );
    private static final FiltersVoice PRIMERA_CORNETA_APOYO = new FiltersVoice("1CORNETA(APOYO)",
            "/1CORNETA",
            List.of("1CORNE","APOY"),
            List.of("GRANDE")
    );
    private static final FiltersVoice SEGUNDA_CORNETA = new FiltersVoice("2CORNETA",
            "",
            List.of("2CORNE"),
            List.of("GRANDE")
    );
    private static final FiltersVoice TERCERA_CORNETA = new FiltersVoice("3CORNETA",
            "",
            List.of("3CORNE"),
            List.of("GRANDE")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_SIB_A = new FiltersVoice("1TROMPETA(SIB)(A)",
            "/1TROMPETA",
            List.of("1TROMPE"),
            List.of("DO","GRANDE","(B")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_SIB_B = new FiltersVoice("1TROMPETA(SIB)(B)",
            "/1TROMPETA",
            List.of("1TROMPE"),
            List.of("DO","GRANDE","(A")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_SIB = new FiltersVoice("1TROMPETA(SIB)",
            "/1TROMPETA",
            List.of("1TROMPE"),
            List.of("(DO)","GRANDE")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_DO_A = new FiltersVoice("1TROMPETA(DO)(A)",
            "/1TROMPETA",
            List.of("1TROMPE","(DO)"),
            List.of("(JC","GRANDE","(B")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_DO_B = new FiltersVoice("1TROMPETA(DO)(B)",
            "/1TROMPETA",
            List.of("1TROMPE","(DO)"),
            List.of("(JC","GRANDE","(A")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_DO = new FiltersVoice("1TROMPETA(DO)",
            "/1TROMPETA",
            List.of("1TROMPE","(DO)"),
            List.of("(JC","GRANDE")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_DO_JC_A = new FiltersVoice("1TROMPETA(DO)(JC)(A)",
            "/1TROMPETA",
            List.of("1TROMPE","(DO)","(JC"),
            List.of("GRANDE","(B")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_DO_JC_B = new FiltersVoice("1TROMPETA(DO)(JC)(B)",
            "/1TROMPETA",
            List.of("1TROMPE","(DO)","(JC"),
            List.of("GRANDE","(A")
    );
    private static final FiltersVoice PRIMERA_TROMPETA_DO_JC = new FiltersVoice("1TROMPETA(DO)(JC)",
            "/1TROMPETA",
            List.of("1TROMPE","(DO)","(JC"),
            List.of("GRANDE")
    );
    private static final FiltersVoice SEGUNDA_TROMPETA_SIB = new FiltersVoice("2TROMPETA(SIB)",
            "/2TROMPETA",
            List.of("2TROMPE"),
            List.of("(DO)","GRANDE")
    );
    private static final FiltersVoice SEGUNDA_TROMPETA_DO = new FiltersVoice("2TROMPETA(DO)",
            "/2TROMPETA",
            List.of("2TROMPE","(DO)"),
            List.of("JC","GRANDE")
    );
    private static final FiltersVoice SEGUNDA_TROMPETA_DO_JC = new FiltersVoice("2TROMPETA(DO)(JC)",
            "/2TROMPETA",
            List.of("2TROMPE","(DO)","(JC)"),
            List.of("GRANDE")
    );
    private static final FiltersVoice TERCERA_TROMPETA_SIB = new FiltersVoice("3TROMPETA(SIB)",
            "/3TROMPETA",
            List.of("3TROMPE"),
            List.of("(DO)","GRANDE")
    );
    private static final FiltersVoice TERCERA_TROMPETA_DO = new FiltersVoice("3TROMPETA(DO)",
            "/3TROMPETA",
            List.of("3TROMPE","(DO)"),
            List.of("JC","GRANDE")
    );
    private static final FiltersVoice TERCERA_TROMPETA_DO_JC = new FiltersVoice("3TROMPETA(DO)(JC)",
            "/3TROMPETA",
            List.of("3TROMPE","(DO)","(JC)"),
            List.of("GRANDE")
    );
    private static final FiltersVoice BOMBARDINO_DO_SOL_A = new FiltersVoice("BOMBARDINO(DO-SOL)(A)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","DO","SOL"),
            List.of("GRANDE","SI","FA","(B")
    );
    private static final FiltersVoice BOMBARDINO_DO_SOL_B = new FiltersVoice("BOMBARDINO(DO-SOL)(B)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","DO","SOL"),
            List.of("GRANDE","SI","FA","(A")
    );
    private static final FiltersVoice BOMBARDINO_DO_SOL = new FiltersVoice("BOMBARDINO(DO-SOL)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","DO","SOL"),
            List.of("GRANDE","SI","FA")
    );
    private static final FiltersVoice BOMBARDINO_SI_SOL_A = new FiltersVoice("BOMBARDINO(SI-SOL)(A)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","SI","SOL"),
            List.of("GRANDE","DO","FA","(B")
    );
    private static final FiltersVoice BOMBARDINO_SI_SOL_B = new FiltersVoice("BOMBARDINO(SI-SOL)(B)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","SI","SOL"),
            List.of("GRANDE","DO","FA","(A")
    );
    private static final FiltersVoice BOMBARDINO_SI_SOL = new FiltersVoice("BOMBARDINO(SI-SOL)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","SI","SOL"),
            List.of("GRANDE","DO","FA")
    );
    private static final FiltersVoice BOMBARDINO_DO_FA_A = new FiltersVoice("BOMBARDINO(DO-FA)(A)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","DO","FA"),
            List.of("GRANDE","SI","SOL","(B")
    );
    private static final FiltersVoice BOMBARDINO_DO_FA_B = new FiltersVoice("BOMBARDINO(DO-FA)(B)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","DO","FA"),
            List.of("GRANDE","SI","SOL","(A")
    );
    private static final FiltersVoice BOMBARDINO_DO_FA = new FiltersVoice("BOMBARDINO(DO-FA)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","DO","FA"),
            List.of("GRANDE","SI","SOL")
    );
    private static final FiltersVoice BOMBARDINO_SI_FA_A = new FiltersVoice("BOMBARDINO(SI-FA)(A)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","SI","FA"),
            List.of("GRANDE","DO","SOL","(B")
    );
    private static final FiltersVoice BOMBARDINO_SI_FA_B = new FiltersVoice("BOMBARDINO(SI-FA)(B)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","SI","FA"),
            List.of("GRANDE","DO","SOL","(A")
    );
    private static final FiltersVoice BOMBARDINO_SI_FA = new FiltersVoice("BOMBARDINO(SI-FA)",
            "/BOMBARDINO",
            List.of("BOMBARDINO","SI","FA"),
            List.of("GRANDE","DO","SOL")
    );

    private static final FiltersVoice TROMBON_DO_SOL_A = new FiltersVoice("TROMBON(DO-SOL)(A)",
            "/TROMBON",
            List.of("TROMBON","DO","SOL"),
            List.of("GRANDE","SI","FA","(B")
    );
    private static final FiltersVoice TROMBON_DO_SOL_B = new FiltersVoice("TROMBON(DO-SOL)(B)",
            "/TROMBON",
            List.of("TROMBON","DO","SOL"),
            List.of("GRANDE","SI","FA","(A")
    );
    private static final FiltersVoice TROMBON_DO_SOL = new FiltersVoice("TROMBON(DO-SOL)",
            "/TROMBON",
            List.of("TROMBON","DO","SOL"),
            List.of("GRANDE","SI","FA")
    );
    private static final FiltersVoice TROMBON_SI_SOL_A = new FiltersVoice("TROMBON(SI-SOL)(A)",
            "/TROMBON",
            List.of("TROMBON","SI","SOL"),
            List.of("GRANDE","DO","FA","(B")
    );
    private static final FiltersVoice TROMBON_SI_SOL_B = new FiltersVoice("TROMBON(SI-SOL)(B)",
            "/TROMBON",
            List.of("TROMBON","SI","SOL"),
            List.of("GRANDE","DO","FA","(A")
    );
    private static final FiltersVoice TROMBON_SI_SOL = new FiltersVoice("TROMBON(SI-SOL)",
            "/TROMBON",
            List.of("TROMBON","SI","SOL"),
            List.of("GRANDE","DO","FA")
    );
    private static final FiltersVoice TROMBON_DO_FA_A = new FiltersVoice("TROMBON(DO-FA)(A)",
            "/TROMBON",
            List.of("TROMBON","DO","FA"),
            List.of("GRANDE","SI","SOL","(B")
    );
    private static final FiltersVoice TROMBON_DO_FA_B = new FiltersVoice("TROMBON(DO-FA)(B)",
            "/TROMBON",
            List.of("TROMBON","DO","FA"),
            List.of("GRANDE","SI","SOL","(A")
    );
    private static final FiltersVoice TROMBON_DO_FA = new FiltersVoice("TROMBON(DO-FA)",
            "/TROMBON",
            List.of("TROMBON","DO","FA"),
            List.of("GRANDE","SI","SOL")
    );
    private static final FiltersVoice TROMBON_SI_FA_A = new FiltersVoice("TROMBON(SI-FA)(A)",
            "/TROMBON",
            List.of("TROMBON","SI","FA"),
            List.of("GRANDE","DO","SOL","(B")
    );
    private static final FiltersVoice TROMBON_SI_FA_B = new FiltersVoice("TROMBON(SI-FA)(B)",
            "/TROMBON",
            List.of("TROMBON","SI","FA"),
            List.of("GRANDE","DO","SOL","(A")
    );
    private static final FiltersVoice TROMBON_SI_FA = new FiltersVoice("TROMBON(SI-FA)",
            "/TROMBON",
            List.of("TROMBON","SI","FA"),
            List.of("GRANDE","DO","SOL")
    );

    private static final FiltersVoice TUBA_DO_SOL_A = new FiltersVoice("TUBA(DO-SOL)(A)",
            "/TUBA",
            List.of("TUBA","DO","SOL"),
            List.of("GRANDE","SI","FA","(B")
    );
    private static final FiltersVoice TUBA_DO_SOL_B = new FiltersVoice("TUBA(DO-SOL)(B)",
            "/TUBA",
            List.of("TUBA","DO","SOL"),
            List.of("GRANDE","SI","FA","(A")
    );
    private static final FiltersVoice TUBA_DO_SOL = new FiltersVoice("TUBA(DO-SOL)",
            "/TUBA",
            List.of("TUBA","DO","SOL"),
            List.of("GRANDE","SI","FA")
    );
    private static final FiltersVoice TUBA_SI_SOL_A = new FiltersVoice("TUBA(SI-SOL)(A)",
            "/TUBA",
            List.of("TUBA","SI","SOL"),
            List.of("GRANDE","DO","FA","(B")
    );
    private static final FiltersVoice TUBA_SI_SOL_B = new FiltersVoice("TUBA(SI-SOL)(B)",
            "/TUBA",
            List.of("TUBA","SI","SOL"),
            List.of("GRANDE","DO","FA","(A")
    );
    private static final FiltersVoice TUBA_SI_SOL = new FiltersVoice("TUBA(SI-SOL)",
            "/TUBA",
            List.of("TUBA","SI","SOL"),
            List.of("GRANDE","DO","FA")
    );
    private static final FiltersVoice TUBA_DO_FA_A = new FiltersVoice("TUBA(DO-FA)(A)",
            "/TUBA",
            List.of("TUBA","DO","FA"),
            List.of("GRANDE","SI","SOL","(B")
    );
    private static final FiltersVoice TUBA_DO_FA_B = new FiltersVoice("TUBA(DO-FA)(B)",
            "/TUBA",
            List.of("TUBA","DO","FA"),
            List.of("GRANDE","SI","SOL","(A")
    );
    private static final FiltersVoice TUBA_DO_FA = new FiltersVoice("TUBA(DO-FA)",
            "/TUBA",
            List.of("TUBA","DO","FA"),
            List.of("GRANDE","SI","SOL")
    );
    private static final FiltersVoice TUBA_SI_FA_A = new FiltersVoice("TUBA(SI-FA)(A)",
            "/TUBA",
            List.of("TUBA","SI","FA"),
            List.of("GRANDE","DO","SOL","(B")
    );
    private static final FiltersVoice TUBA_SI_FA_B = new FiltersVoice("TUBA(SI-FA)(B)",
            "/TUBA",
            List.of("TUBA","SI","FA"),
            List.of("GRANDE","DO","SOL","(A")
    );
    private static final FiltersVoice TUBA_SI_FA = new FiltersVoice("TUBA(SI-FA)",
            "/TUBA",
            List.of("TUBA","SI","FA"),
            List.of("GRANDE","DO","SOL")
    );


    public static final List<FiltersVoice> VOICES = List.of(
            PRIMERA_CORNETA_FUERTE_A,
            PRIMERA_CORNETA_FUERTE_B,
            PRIMERA_CORNETA_PIANO_A,
            PRIMERA_CORNETA_PIANO_B,
            PRIMERA_CORNETA_QUINTO_A,
            PRIMERA_CORNETA_QUINTO_B,
            PRIMERA_CORNETA_APOYO,
            SEGUNDA_CORNETA,
            TERCERA_CORNETA,
            PRIMERA_TROMPETA_SIB_A,
            PRIMERA_TROMPETA_SIB_B,
            PRIMERA_TROMPETA_SIB,
            PRIMERA_TROMPETA_DO_A,
            PRIMERA_TROMPETA_DO_B,
            PRIMERA_TROMPETA_DO,
            PRIMERA_TROMPETA_DO_JC_A,
            PRIMERA_TROMPETA_DO_JC_B,
            PRIMERA_TROMPETA_DO_JC,
            SEGUNDA_TROMPETA_SIB,
            SEGUNDA_TROMPETA_DO,
            SEGUNDA_TROMPETA_DO_JC,
            TERCERA_TROMPETA_SIB,
            TERCERA_TROMPETA_DO,
            TERCERA_TROMPETA_DO_JC,
            BOMBARDINO_DO_SOL_A,
            BOMBARDINO_DO_SOL_B,
            BOMBARDINO_DO_SOL,
            BOMBARDINO_SI_SOL_A,
            BOMBARDINO_SI_SOL_B,
            BOMBARDINO_SI_SOL,
            BOMBARDINO_DO_FA_A,
            BOMBARDINO_DO_FA_B,
            BOMBARDINO_DO_FA,
            BOMBARDINO_SI_FA_A,
            BOMBARDINO_SI_FA_B,
            BOMBARDINO_SI_FA,
            TROMBON_DO_SOL_A,
            TROMBON_DO_SOL_B,
            TROMBON_DO_SOL,
            TROMBON_SI_SOL_A,
            TROMBON_SI_SOL_B,
            TROMBON_SI_SOL,
            TROMBON_DO_FA_A,
            TROMBON_DO_FA_B,
            TROMBON_DO_FA,
            TROMBON_SI_FA_A,
            TROMBON_SI_FA_B,
            TROMBON_SI_FA,
            TUBA_DO_SOL_A,
            TUBA_DO_SOL_B,
            TUBA_DO_SOL,
            TUBA_SI_SOL_A,
            TUBA_SI_SOL_B,
            TUBA_SI_SOL,
            TUBA_DO_FA_A,
            TUBA_DO_FA_B,
            TUBA_DO_FA,
            TUBA_SI_FA_A,
            TUBA_SI_FA_B,
            TUBA_SI_FA,
            PRIMERA_CORNETA_GRANDE,
            GUION_EDU,
            GUION_ORIGINAL
    );
}
