package <missing>;

public class GlobalMembers
{
	public static int[] come = new int[1000];
	public static int[] out = new int[1000];
	public static int in()
	{
		int i = 0;
		int j = 0;
		char a;
		while (true)
		{
			come[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a); //????
			if (a == '\n')
			{
				break;
			}

		}
		i = 0;

	while (true)
	{
			out[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			if (a == '\n')
			{
				break;
			}

	}
	return i - 1;
	}
	public static int check(int max)
	{
		int i;
		int j;
		int k = 0;
		int[] same = new int[1000];
		for (i = 0;i <= 1000;i++) //?????
		{
			for (j = 0;j <= max;j++)
			{
			if (i >= come[j] != 0 && i < out[j])
			{
				same[k]++;
			}
			}
			k++;
		}
		return search(same);

	}
	public static int search(int[] same)
	{
		int i;
		int ma = 0;
		for (i = 0;i < 1000;i++)
		{
		   if (ma < same[i]) //???
		   {
			   ma = same[i];
		   }
		}
		return ma;
	}
	public static int Main()
	{
		int max;
	  max = in(); //???????
	  System.out.print(max + 1);
	  System.out.print(" ");
	  System.out.print(check(max));
	  return 0;
	}
}

