package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[50][20];
		String p = new String(new char[20]);
		String r = new String(new char[20]);
	   int i = 0;
	   int n = 0;
	   a[0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   while (System.in.read() != '\n')
	   {
	   i++;
	   a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   n = i;
	   }
	   p = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   System.in.read();
	   r = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   for (i = 0;i <= n;i++)
	   {
	   if (strcmp(a[i],p) == 0)
	   {
		   a[i] = r;
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   System.out.print(a[i]);
		   System.out.print(" ");
	   }
	   System.out.print(a[n]);
	   System.out.print("\n");
		return 0;
	}
}

