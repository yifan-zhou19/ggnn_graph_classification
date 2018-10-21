package <missing>;

public class GlobalMembers
{
	/*
	 * lee2.cpp
	 *
	 *  Created on: 2011-6-8
	 *      Author: 09143
	 */
	public static int kMis;
	public static int[] Mis = new int[30];
	public static int[] Array = new int[30];
	public static void Lanjie(int iM)
	{
		for (int i = iM; i < kMis; i++)
		{
			if (Mis[iM - 1] >= Mis[i] != 0 && Array[iM - 1] <= Array[i])
			{
				Array[iM - 1] = Array[i] + 1;
			}
		}
		if (iM > 1)
		{
			Lanjie(iM - 1);
		}
		return;
	}
	public static int Main()
	{

		kMis = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < kMis; i++)
		{
			Mis[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < kMis; i++)
		{
			Array[i] = 1;
		}
		Lanjie(kMis);
		int MaxLen = -1;
		for (int i = 0; i < kMis; i++)
		{
			if (MaxLen < Array[i])
			{
				MaxLen = Array[i];
			}
		}
		System.out.print(MaxLen);
		System.out.print("\n");

	}

}

