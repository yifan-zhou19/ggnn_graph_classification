package <missing>;

public class GlobalMembers
{
	//**********************************
	//*  ????homework_5.cpp        *
	//*  ??????1200012884        * 
	//*  ?????2012?12?17?      *
	//*  ???????2?N?? 
	//**********************************
	public static int Main()
	{
		int n;
		int temp;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int[] a = new int[100];
		a[0] = 1;
		len = 1;
		for (i = 0;i < n;i++)
		{
			temp = 0;
			for (j = 0;j < len;j++)
			{
				a[j] = a[j] * 2 + temp;
				temp = Math.floor(a[j] / 10);
				a[j] = a[j] % 10;
			}
			if (temp > 0)
			{
				a[j] = temp;
				len++;
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

