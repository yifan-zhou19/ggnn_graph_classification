package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] graphic = new int[100][100]; //??????
	int i = 0; //???????
	int j = 0;
	int rightEst;
	int bottumEst;
	int width = 0;
	int lengh = 0;
	for (i = 0;i < num;i++)
	{
	for (j = 0;j < num;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		graphic[i][j] = Integer.parseInt(tempVar);
	}
	if (graphic[i][j] == 0)
	{
	rightEst = i;
	bottumEst = j; //???????
	}
	}
	}
	for (i = rightEst,j = bottumEst;i >= 0;i--)
	{ //???
	if (graphic[i][j] == 0)
	{
		width++;
	}
	else
	{
		break;
	}
	}
	for (i = rightEst,j = bottumEst;j >= 0;j--)
	{ //???
	if (graphic[i][j] == 0)
	{
		lengh++;
	}
	else
	{
		break;
	}
	}
	int portation = width * lengh - width * 2 - (lengh - 2) * 2; //?????????

	System.out.print(portation);
	System.out.print("\n");
	return 0;
	}

}

