package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		String p;
		String l;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
		int m;
		int n;

		int k = 0;
		for (t = s; * t != '\0';t++)
		{
			k++;
		}
		n = 0;
		m = 0;
		for (l = w; l != '\0';l++&&n++)
		{

			for (p = s; p != '\0' && l != '\0' && l == p;p++&&l++)
			{
				m++;
			}


			if (m == k)
			{

				System.out.printf("%d",n);
				break;
			}

		}






	}
}

