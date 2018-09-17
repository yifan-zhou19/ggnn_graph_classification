package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[301]);
		s = new Scanner(System.in).nextLine();


		String b = new String(new char[301]);
		String d = new String(new char[30]);
		char t;
		int i;
		int j = 0;
		int h = 0;
		int len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, s.charAt(i));
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("No\n");
		}


		int[] c = new int[30];
		int m;
		char k;
		for (k = 'a';k <= 'z';k++)
		{
			for (m = 0;m < j;m++)
			{
				if (b.charAt(m) == k)
				{
					d = tangible.StringFunctions.changeCharacter(d, h, k);
					h++;
					break;
				}
			}
		}
		for (k = 0;k < h;k++)
		{
		  for (i = 0;i < j;i++)
		  {
			if (b.charAt(i) == d.charAt(k))
			{
				c[k]++;
			}
		  }
		}




		  for (i = 0;i < h;i++)
		  {
			System.out.printf("%c=%d\n",d.charAt(i),c[i]);
		  }
	}

}

