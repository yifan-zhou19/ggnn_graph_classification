package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int[] shumu = new int[4];
		int i;
		String pai = new String(new char[4]);
		for (i = 1;i <= 3;i++)
		{
			shumu[i] = 0;
		}
		for (A = 1;A <= 3;A++)
		{
						  for (B = 1;B <= 3;B++)
						  {
										   if (A == B)
										   {
											   continue;
										   }
										   C = 6 - A - B;
										   shumu[1] = (B > A) + (A == C); //A???????
										   shumu[2] = (A > B) + (A > C); //B???????
										   shumu[3] = (C > B) + (B > A); //C???????
															if ((shumu[1] + A) == (shumu[2] + B) && (shumu[2] + B) == (shumu[3] + C)) //?????????????????????????
															{
																						  pai = tangible.StringFunctions.changeCharacter(pai, A, 'A');
																						  pai = tangible.StringFunctions.changeCharacter(pai, B, 'B');
																						  pai = tangible.StringFunctions.changeCharacter(pai, C, 'C');
															}
						  }
		}
		for (i = 1;i <= 3;i++)
		{
			System.out.print(pai.charAt(i));
		}
		return 0;
	}
}

