package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i = 0;
	 int j;
	 String a = new String(new char[100]);
	 while ((a[i] = System.in.read()) != '\n')
	 {
	  i++;
	 }
	 for (j = i - 1;j >= 0;j -= 1)
	 {
	  System.out.print(a.charAt(j));
	 }

	 return 0;
	}
}
