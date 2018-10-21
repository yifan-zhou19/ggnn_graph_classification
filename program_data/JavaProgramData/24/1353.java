package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[999]);
		String k = new String(new char[55]);
		String h = new String(new char[55]);
		int i;
		int j;
		int n;
		int max;
		int min;
		int x;
		int n1;
		int n2;
		int n3;
		int n4;
		int[] m = new int[55];
		int q = 0;
		int o = 0;
		z = new Scanner(System.in).nextLine();
		n = z.length();
		int p = 1;
		for (i = 0;i < n;i++)
		{
			if (z.charAt(i) == ' ')
			{
			   m[p] = i;
			   p++;
			}
		}
		m[0] = -1;
		m[p] = n;
		n1 = n3 = -1;
		n2 = n4 = m[1];
		max = min = m[1] - m[0] - 1;
		if (p > 1)
		{
		  for (j = 0;j < p;j++)
		  {
			 x = m[j + 1] - m[j] - 1;
			 if (x > max)
			 {
				max = x;
				n1 = m[j];
				n2 = m[j + 1];
			 }
			 else if (x < min)
			 {
				min = x;
				n3 = m[j];
				n4 = m[j + 1];
			 }
		  }

		 for (i = n1 + 1;i < n2;i++)
		 {
			 k = tangible.StringFunctions.changeCharacter(k, q, z.charAt(i));
			 q++;
		 }
		  k = tangible.StringFunctions.changeCharacter(k, q, '\0');
		  for (i = n3 + 1;i < n4;i++)
		  {
			 h = tangible.StringFunctions.changeCharacter(h, o, z.charAt(i));
			 o++;
		  }
		  h = tangible.StringFunctions.changeCharacter(h, o, '\0');
		}

	   System.out.printf("%s\n%s",k,h);
	   return 0;
	}
}

