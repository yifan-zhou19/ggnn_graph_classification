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
										   if (B > A)
										   {
											   shumu[1]++;
										   }
										   if (A == C)
										   {
											   shumu[1]++; //A???????
										   }
										   if (A > B)
										   {
											   shumu[2]++;
										   }
										   if (A > C)
										   {
											   shumu[2]++; //B???????
										   }
										   if (C > B)
										   {
											   shumu[3]++;
										   }
										   if (B > A)
										   {
											   shumu[3]++; //C???????
										   }
															if ((shumu[1] + A) == (shumu[2] + B) && (shumu[2] + B) == (shumu[3] + C)) //?????????????????????????
															{
																						  pai = tangible.StringFunctions.changeCharacter(pai, A, 'A');
																						  pai = tangible.StringFunctions.changeCharacter(pai, B, 'B');
																						  pai = tangible.StringFunctions.changeCharacter(pai, C, 'C');
															}
	for (i = 1;i <= 3;i++)
	{
		shumu[i] = 0;
	}
						  }
		}
		for (i = 1;i <= 3;i++)
		{
			System.out.print(pai.charAt(i));
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}

