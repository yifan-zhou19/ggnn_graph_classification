package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int[] x = new int[10000];
		int[] y = new int[10000];
		int[] c = new int[10000];
		int i;
		int j;
		int p;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char* z=strtok(a,",");
		char z = tangible.StringFunctions.strTok(a,","); //?????
		p = 0;
		while (z != null)
		{
			x[++p] = Integer.parseInt(z); //????????????????
			z = tangible.StringFunctions.strTok(null,","); //???????,?????????????
		}
		z = tangible.StringFunctions.strTok(b,",");
		p = 0;
		while (z != null)
		{
			y[++p] = Integer.parseInt(z);
			z = tangible.StringFunctions.strTok(null,",");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= p;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				c[j]++;
			}
		}
		int max = 0;
		for (int g = 1;g <= 10000;g++)
		{
			if (c[g] > max)
			{
				max = c[g];
			}
		}
		System.out.print(p);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}





}

