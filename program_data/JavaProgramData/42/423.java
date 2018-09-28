package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] buffer = new int[200000];
		int NumOfBF;
		int NumToDelete;
		int NumofDel = 0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			NumOfBF = Integer.parseInt(tempVar);
		}
		for (i = 0;i < NumOfBF;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					buffer[i] = Integer.parseInt(tempVar2);
				}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			NumToDelete = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < NumOfBF - NumofDel;j++)
		{
			if (buffer[j] == NumToDelete)
			{
			for (k = j;k < NumOfBF - NumofDel;k++)
			{
			buffer[k] = buffer[k + 1];
			}
			NumofDel++;
			j = j - 1;
			}
		}
		System.out.printf("%d",buffer[0]);
		for (j = 1;j < NumOfBF - NumofDel;j++)
		{
		System.out.printf(" %d",buffer[j]);
		}
		System.out.print("\n");
		return 0;
	}
}

