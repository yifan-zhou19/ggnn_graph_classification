package <missing>;

public class GlobalMembers
{
	//**************************
	//*?????              *
	//*????????        *
	//*???1000012832        *
	//**************************
	public static int Main()
	{
		int[] a = new int[16]; //????
		int i;
		int j;
		int k;
		int m;
		int n;
		int count;
			for (i = 0;;i++)
			{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (m == -1) //???1???????
				{
				  break;
				}
				else //????1?????????????
				{
				  count = 0;
				  a[0] = m;
				  for (j = 1;j < 16;j++) //???????????
				  {
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[j] == 0) //???0
					{
					  break; //?????
					}
				  }


				  n = j; //???j-1???
				  for (j = 0;j < n;j++)
				  {
				  for (k = j + 1;k < n;k++)
				  {
					 if (a[j] == 2 * a[k] || a[k] == 2 * a[j]) //?????????2?????????????????1
					 {
						 count++;
					 }
				  }
				  }

				  System.out.print(count);
				  System.out.print("\n");
				}
			}

		return 0;

	}
}

