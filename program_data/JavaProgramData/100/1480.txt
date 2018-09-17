package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		int i;
		int j;
		int q;
		int h = 0;
		int k;
		s = new Scanner(System.in).nextLine();
		for (i = 65;i <= 122;i++)
		{
			k = 0;
			if (i <= 90)
			{
			for (j = 0;s.charAt(j) != 0;j++)
			{
				if (s.charAt(j) == i)
				{
					k++;
				}
			}
			}
			if (i == 91)
			{
				i = 96;
			}
			if (i >= 97)
			{
				 for (q = 0;s.charAt(q) != 0;q++)
				 {
				   if (s.charAt(q) == i)
				   {
					   k++;
				   }
				 }
			}
				if (k != 0)
				{
					System.out.printf("%c=%d\n",i,k);
					h++;
				}
		}
		if (h == 0)
		{
			System.out.print("No");
		}
	}


}
