package commen.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.PropertyUtilsBean;

public class FormUtil {

	public static Object formToBean(HttpServletRequest request , Class<?> clazz) {
		ConvertUtilsBean convertUtilsBean = new ConvertUtilsBean();
		convertUtilsBean.deregister(Date.class);
		convertUtilsBean.register(new DateConverter(), Date.class);
		BeanUtilsBean beanUtilsBean = new BeanUtilsBean(convertUtilsBean, new PropertyUtilsBean());
		Object o = null;
		try {
			o = clazz.newInstance();
			beanUtilsBean.populate(o, request.getParameterMap());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return o;
	}
}
