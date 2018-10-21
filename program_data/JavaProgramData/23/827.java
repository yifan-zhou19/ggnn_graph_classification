package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String w;
		int n;
		int i;
		int j;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		w = a;
		p = a.charAt(n - 1);
		q = p;
		for (i = 0;i < n;i++)
		{
			if (*(q - i) != ' ' && (q - i) >= w)
			{
				k++;
				p--;
			}
			else
			{
				for (j = 0;j < k;j++)
				{
					System.out.printf("%c",*(p + j + 1));
				}
				System.out.print(" ");
				k = 0;
				p--;
			}
			if ((q - i) == w)
			{
			   for (j = 0;j < k;j++)
			   {
				   System.out.printf("%c",*(p + j + 1));
			   }
			}
		}
		return 0;
	}
}
