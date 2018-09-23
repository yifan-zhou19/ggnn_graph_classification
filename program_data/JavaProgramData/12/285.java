package <missing>;

public class GlobalMembers
{
	//**************************************
	//*??????                        *
	//*???????????              *
	//*??????                        *
	//*?????11.5                      *
	//**************************************




	public static int Main()
	{
		int[] a = new int[16];
		for (int i = 0;;)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] != 0 && a[i] != -1)
			{
				i++;
				continue;
			}
			else if (a[i] == 0)
			{
				int n = 0;
				for (int j = 0;j < i - 1; j++)
				{
					for (int k = j + 1; k < i; k++)
					{
						if (((a[j] / a[k] == 2) && !(a[j] % a[k])) || ((a[k] / a[j] == 2) && !(a[k] % a [j])))
						{
						n++;
						}
					}
				}
				System.out.print(n);
				System.out.print("\n");
				i = 0;
				continue;
			}
			else
			{
				break;
			}
		}
		return 0;
	}


}

