package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int num[300]={0},i=0,j,k,n,t;
		int[] num = new int[300];
		int i = 0;
		int j;
		int k;
		int n;
		int t;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			i++;
		} while (System.in.read() == ',');
		n = i;
		if (n == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				k = i;
				for (j = i + 1;j < n;j++)
				{
					if (num[k] < num[j])
					{
						k = j;
					}
				}
				if (k != i)
				{
					t = num[k];
					num[k] = num[i];
					num[i] = t;
				}
			}
			for (i = 1;i < n;i++)
			{
				if (num[i] < num[0])
				{
					j = i;
					break;
				}
			}
			if (i == n)
			{
				System.out.print("No\n");
			}
			else
			{
				System.out.printf("%d\n",num[j]);
			}
		}
	}

}

