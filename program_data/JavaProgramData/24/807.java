package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[1000]);
		final String m = "";
		int[] array = new int[50];
		int i;
		int j;
		int p = 0;
		int w = 0;
		int max = 0;
		int min = 100;
		int a;
		int b;
		sz = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (sz.charAt(i) == ' ')
			{
				array[p] = w;
				w = 0;
				p++;
			}
			else if (sz.charAt(i) == null)
			{
				array[p] = w;
				break;
			}
			else
			{
				m.charAt(p)[w] = sz.charAt(i);
				w++;
			}
		}
		for (i = 0;i <= p;i++)
		{
		//	printf("%d %s\n",array[i],m[i]);
		}
		for (a = 0;a <= p;a++)
		{
			if (array[a] < min)
			{
				min = array[a];
			}
		}
	//	printf("%d\n",min);
		for (b = 0;b <= p;b++)
		{
			if (array[b] > max)
			{
				max = array[b];
			}
		}
	//	printf("%d\n",max);
		for (b = 0;b <= p;b++)
		{
			if (array[b] == max)
			{
				System.out.println(m.charAt(b));
				break;
			}
		}
		for (a = 0;a <= p;a++)
		{
			if (array[a] == min)
			{
				System.out.println(m.charAt(a));
				break;
			}
		}
		return 0;
	}

}
