package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?1134 ??                             *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 4 ?                    * 
	//* ? ? ? ???????????????            *
	//* ? ?      ?1000010439                            *
	//******************************************************
	public static int Main() //???
	{
		int[][] a = new int[17][1000]; //?????????????????
		int i;
		int j;
		int k;
		int[] s = new int[1000];
		int[] sum = new int[1000]; //??????????
		int g = 0;
		int n;
		for (i = 0,k = 0;i <= 1000;i++,k++) //????????
		{
			for (j = 0;j <= 16;j++,s[i]++)
			{
				a[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[j][i] == 0) //??0?????????????
				{
				break;
				}
				else if (a[j][i] == -1) //??-1?????
				{
					 g = 1;
					 break;
				}
			}
			if (g == 1)
			{
			break;
			}
		}
		for (i = 0;i <= k - 1;i++) //????????
		{
			for (j = s[i];j >= 0;j--)
			{
				for (n = 0;n < j;n++)
				{
					if (a[n][i] < a[j][i])
					{
					   if (a[j][i] == 2 * a[n][i])
					   {
					   sum[i]++;
					   }
					}
					else
					{
					   if (a[n][i] == 2 * a[j][i])
					   {
					   sum[i]++;
					   }
					}
				}
			}
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

