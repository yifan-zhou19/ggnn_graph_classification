package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			String cc = new String(new char[101]);
			String dd = new String(new char[101]);
			char e;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * d;
			int i = 0;
			cc = new Scanner(System.in).nextLine();

			d = dd;
			c = cc;
			for (; * c != '\0';c++,d++)
			{
			*d = c + *(c + 1);
			}

			e = (c - 1);
			*d = '\0';
			c = cc;
			*(d - 1) = *c + e;

			d = dd;
			System.out.printf("%s",d);
			return 0;
		}

}
