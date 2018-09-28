package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//??????
	//?????????
	//??????
	//************************************************************************
	public static int Main()
	{
		int mZ;
		int mQ;
		int mS;
		int mL;
		int c;
		int sum;
		int[] m = new int[4];
		char[] name = {'z', 'q', 's', 'l'};
		char n;
		for (mZ = 10; mZ <= 50; mZ = mZ + 10)
		{
			for (mQ = 10; mQ <= 50; mQ = mQ + 10)
			{
				for (mS = 10; mS <= 50; mS = mS + 10)
				{
					for (mL = 10; mL <= 50; mL = mL + 10)
					{
						sum = (mZ + mQ == mS + mL) + (mZ + mL > mS + mQ) + (mZ + mS < mQ);
						if (sum == 3)
						{
							m[0] = mZ;
							m[1] = mQ;
							m[2] = mS;
							m[3] = mL;
						}
					}
				}
			}
		}
		for (int j = 0; j < 3; j++)
		{
		   for (int i = 0; i < 3; i++)
		   {
			   if (m[i] < m[i + 1])
			   {
				   c = m[i + 1];
				   n = name[i + 1];
				   m[i + 1] = m[i];
				   name[i + 1] = name[i];
				   m[i] = c;
				   name[i] = n;
			   }
		   }
		}
		System.out.print(name[0]);
		System.out.print(" ");
		System.out.print(m[0]);
		System.out.print("\n");
		System.out.print(name[1]);
		System.out.print(" ");
		System.out.print(m[1]);
		System.out.print("\n");
		System.out.print(name[2]);
		System.out.print(" ");
		System.out.print(m[2]);
		System.out.print("\n");
		System.out.print(name[3]);
		System.out.print(" ");
		System.out.print(m[3]);
		System.out.print("\n");
		return 0;
	}
}
