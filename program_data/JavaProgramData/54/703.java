package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] apple = new int[1000];
		int n;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apple[n] = k;
		do
		{
		   apple[n] += n;
		   for (i = n;i >= 1;i--)
		   {
			   if (apple[i] % (n - 1) != 0)
			   {
			   break;
			   }
			   else
			   {
				  apple[i - 1] = apple[i] * n / (n - 1) + k;
			   }
		   }
		}while (i > 1);
		System.out.print(apple[1]);
		System.out.print("\n");
		return 0;
	}

}

