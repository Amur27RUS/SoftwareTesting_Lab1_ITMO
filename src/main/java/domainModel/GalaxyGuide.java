package domainModel;

import java.util.HashMap;

public class GalaxyGuide {
    private final HashMap<String, String> def = new HashMap<String, String>(){{
        def.put("Кибернитическая корпорация Сириус",
                "кучка безмозглых придурков, которых первыми поставят к стенке, когда начнется революция");
        def.put("Корпорация Центавра", "Умные ребята, которые не боятся революции");
        def.put("Звезда", "Небесное тело, видимое простым глазом в форме светящейся точки на небе.");
        def.put("Сфера Дайсона", "гипотетический астроинженерный проект, предложенный Фрименом Дайсоном," +
                " представляющий собой относительно тонкую сферическую оболочку большого радиуса со звездой в центре.");
    }};

    public String getDef(String object){
        return def.get(object);
    }

    public void setDef(String object, String definition){
        def.put(object, definition);
    }
}