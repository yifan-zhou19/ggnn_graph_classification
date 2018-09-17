package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??????                         **
	//*????? 1100012762                **
	//*???2011.10.21                     **
	//****************************************
	public static int Main()
	{
		int[] a = new int[4];
		int[] A = new int[4];
		char[] ch = {0, 65, 66, 67}; //???????????b???????????????
		String b = new String(new char[4]);
		for (a[1] = 1; a[1] <= 3; a[1]++)
		{
			for (a[2] = 1; a[2] <= 3; a[2]++)
			{
				for (a[3] = 1; a[3] <= 3; a[3]++)
				{
					A[1] = (a[2] > a[1]) + (a[3] == a[1]);
					A[2] = (a[1] > a[2]) + (a[1] > a[3]);
					A[3] = (a[3] > a[2]) + (a[2] > a[1]);
					if (a[1] + A[1] == 3 && a[2] + A[2] == 3 && a[3] + A[3] == 3) //?????????????????????123??????321?
					{
						for (int i = 1;i <= 3; i++)
						{
							b = tangible.StringFunctions.changeCharacter(b, a[i], ch[i]); //?????????????????????????????
						}
						System.out.print(b.charAt(1));
						System.out.print(b.charAt(2));
						System.out.print(b.charAt(3));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

