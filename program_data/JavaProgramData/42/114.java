package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ? ? ? ? ?               *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 10 ? 1 ?                    * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		int n; //??a???????count??a?k???
		int[] a = new int[100000];
		int k;
		int count = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		//??j??k?????????????????i?????????k?????????????
		for (int i = 0; i < n; i++)
		{
			if (a[i] != k)
			{
				a[j++] = a[i];
			}
			else
			{
				count++;
			}
		}
		System.out.print(a[0]);
		for (int i = 1; i < n - count; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}
}

