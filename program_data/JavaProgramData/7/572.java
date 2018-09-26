package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[257]);
		String y = new String(new char[257]);
		String t = new String(new char[257]);
		int i;
		int j;
		int p;
		int v;
		int x;
		int s;
		int result;
		int word = 0;
		int a;
		y = new Scanner(System.in).nextLine();
		z = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		v = z.length();
		x = y.length();
		s = t.length();

		for (i = 0;y.charAt(i) != '\0';i++)
		{
			if ((y.charAt(i) == z.charAt(0)) && (y.charAt(i + v - 1) == z.charAt(v - 1)))
			{
				for (p = 0;p <= v - 1;p++)
				{
					if (y.charAt(i + p) == z.charAt(p))
					{
						word++;
					}
				}
				if (word == v)
				{

				a = i;

				result = 0;
				}
			}
			//		if(y[i]!=z[0]\\(y[i+v-1]!=z[v-1])){
			//			sum++;
			//		}


		}
		//	printf("%d",a);
		if (result == 0)
		{
			for (i = 0;i <= a - 1;i++)
			{
				System.out.printf("%c",y.charAt(i));
			}
			for (i = 0;i <= s - 1;i++)
			{
				System.out.printf("%c",t.charAt(i));
			}
			for (i = a + v;i <= x - 1;i++)
			{
				System.out.printf("%c",y.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s",y);
		}
		return 0;
	}

}
