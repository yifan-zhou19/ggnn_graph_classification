import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
		String s1 = new String(new char[110]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * sf1 = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * sf2 = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s11 = null;
		s = new Scanner(System.in).nextLine();
		sf1 = s;
		sf2 = s.Substring(1);
		s11 = s1;
		while (*sf2 != '\0')
		{
			*s11 = sf1 + *sf2;
			s11++;
			sf1++;
			sf2++;
		}
		sf2 = s;
		*s11 = sf1 + *sf2;
		*++s11 = '\0';
		System.out.print(s1);
		return 0;
	}
}
