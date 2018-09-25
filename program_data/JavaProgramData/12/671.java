package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[16];
		int i;
		int j;
		int k;
		int n = 0;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0; i < 16; i++)
			{
				 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 if (a[i] == 0)
				 {
					 break;
				 }
				 if (a[i] == -1)
				 {
					 return 0;
				 }
			}
			n = 0;
			for (k = 0; k <= i - 1; k++)
			{
				 for (j = k + 1; j <= i - 1; j++)
				 {
					if (((a[k] * 2 == a[j]) || (a[k] == (2 * a[j]))) && (a[k] != 0))
					{
						n++;
					}
				 }
			}
			System.out.print(n);
			System.out.print("\n");
		}while (1 != 0);

		return 0;
	}

}

