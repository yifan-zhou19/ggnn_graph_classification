package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int[] b = new int[300];
		int c = 0;
		String d = new String(new char[300]);
		char k;
		d = new Scanner(System.in).nextLine();
		for (k = 'A';k <= 'Z';k++)
		{
			 for (i = 0;i < 300 && d.charAt(i) != '\0';i++)
			 {
								  if (d.charAt(i) == k)
								  {
								  b[k]++;
								  }
			 }
								  if (b[k] != 0)
								  {
								  System.out.printf("%c=%d\n",k,b[k]);
								  }
		}
		 for (k = 'a';k <= 'z';k++)
		 {
			 for (i = 0;i < 300 && d.charAt(i) != '\0';i++)
			 {
								  if (d.charAt(i) == k)
								  {
								  b[k]++;
								  }
			 }
								  if (b[k] != 0)
								  {
								  System.out.printf("%c=%d\n",k,b[k]);
								  }
		 }
			 for (i = 0;i < 300;i++)
			 {
			 if (b[i] != 0)
			 {
			 c = 1;
			 }
			 }
			 if (c == 0)
			 {
			 System.out.print("No");
			 }
			 return 0;
	}
}
