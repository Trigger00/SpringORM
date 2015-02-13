package com.tecsup.spingorm;

import com.tecsup.spingorm.dao.ProgramaDAO;
import com.tecsup.spingorm.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		// App.doSave(cntx);
		// App.doDelete(cntx);
		// App.doDelete(cntx);
		App.doDelete(cntx);
		App.doList(cntx);
	}

	public static void doList(ApplicationContext cntx) {

		ProgramaDAO dao = (ProgramaDAO) cntx.getBean("programaDAO");
		List<Programa> list = dao.list();
		for (Programa programa : list) {
			System.out.println(programa.getNombre() + " - "
					+ programa.getCodigo() + " - " + programa.getId());
		}
	}

	public static void doSave(ApplicationContext cntx) {
		ProgramaDAO dao = (ProgramaDAO) cntx.getBean("programaDAO");

		Programa programa = new Programa();
		programa.setCodigo("9999");
		programa.setDescripcion("Programa base de datos");
		programa.setNombre("database");
		

		dao.save(programa);
	}

	public static void doUpdate(ApplicationContext cntx) {
		ProgramaDAO dao = (ProgramaDAO) cntx.getBean("programaDAO");

		Programa programa = dao.findByCodigo("1700");
		programa.setDescripcion("111");
		programa.setNombre("111");
		programa.setCodigo("111");
		dao.update(programa);
	}

	public static void doDelete(ApplicationContext cntx) {
		ProgramaDAO dao = (ProgramaDAO) cntx.getBean("programaDAO");
		try {
			dao.delete(4l);
		} catch (Exception e) {

			System.out.println("No hallo el id");
		}

	}

}