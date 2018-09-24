package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1; //r?????????b????????
		int n;
		int j;
		int r = 0;
		int[] a = new int[20001];
		int[] b = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,1,(Integer.SIZE / Byte.SIZE)); //?b????????1?????????0

		 do
		 {
		   r = r + 1; //??????
		   j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (b[j] != 0) //????????a?????????
		   {
		   a[i] = j;
		   b[a[i]] = 0;
		   i = i + 1;
		   }
		 } while (r < n);

		for (j = 1;j < i - 1;j++)
		{
			System.out.print(a[j]);
			System.out.print(' ');
		}
		System.out.print(a[i - 1]);


		return 0;
	}

}

