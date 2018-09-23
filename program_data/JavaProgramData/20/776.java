package <missing>;

public class GlobalMembers
{
	public static void charu(tangible.RefObject<String> p1, tangible.RefObject<String> p2)
	{
		 int k = 0;
		 int i;
		 int maxx = 0;
		while (*(p1.argValue.Substring(k)) != '\0')
		{
			if (*(p1.argValue.Substring(k)) > *(p1.argValue.Substring(maxx)))
			{
			  maxx = k;
			}
			  k++;
		}
		 for (i = 0;i <= maxx;i++)
		 {
			System.out.print((p1.argValue.Substring(i)));
		 }
			System.out.print(p2.argValue);
		 for (i = maxx + 1; * (p1.argValue.Substring(i)) != '\0';i++)
		 {
			System.out.print((p1.argValue.Substring(i)));
		 }
			System.out.print("\n");
	}
	public static int Main()
	{
		char[][] a = new char[1000][15];
		char[][] b = new char[1000][3];
		int i = 0;
		while ((a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		  b[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  charu(a[i], b[i]);
		  i++;
		}
	return 0;
	}
}

