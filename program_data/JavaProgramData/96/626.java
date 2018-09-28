package <missing>;

public class GlobalMembers
{
	//****************************************************
	//*  ? ? ?: homework.cpp                          *
	//*  ?    ?: ???                                *
	//*  ????: 2012?11?10?                        *
	//*  ????: ??13                                *
	//****************************************************



	public static int Main()
	{
		int[] a = new int[101]; //???
		int[] b = new int[101]; //?
		int num = 0; //len??????
		int h = 0;
		int p;
		int len = 0;
		int i = 0;
		char c;
		while ((c = System.in.read()) != '\n') //??
		{
			len++;
			a[len] = (int) c - 48;
		}
		while (i <= len - 1) //??????
		{
			i++;
			num = num * 10 + a[i];
			h++;
			b[h] = num / 13;
			num = num % 13;
		}
		for (i = 1; i <= h; i++) //???????????
		{
			if (b[i] != 0)
			{
				break;
			}
		}
		p = i;
		for (i = p; i <= h; i++)
		{
			System.out.print(b[i]);
		}
		if (p > h)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}
