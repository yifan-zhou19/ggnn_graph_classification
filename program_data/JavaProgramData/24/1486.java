package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		char[][] b = new char[50][200];
		int[] n = new int[100];
		int i;
		int j = 0;
		int x;
		int y = 0;
		int k = 0;
		int m;
		int flag = 0;
		for (i = 0;a.charAt(i - 1) != '\n';i++) //?????
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, i - 1, '\0');
		i = 0;
		do //???????????????????
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				b[j][k] = a.charAt(i);
				k++;
			}
			else
			{
				b[j][k] = '\0';
				k = 0;
				j++;
			}
			i++;
		}while (a.charAt(i - 1) != '\0');
		x = j;

		//?????	
	/*	for(i=0;i<x;i++)
		{
		    printf("%s\n",b[i]);
		}
	*/ 

		for (i = 0;i < x;i++) //??????????????????????
		{
			n[i] = String.valueOf(b[i]).length();
		}
		i = 0;
		for (j = 0;j < x;j++) //??????????????????
		{
			if (n[j] > y)
			{
				y = n[j];
				m = j;
			}
		}
		System.out.printf("%s\n",b[m]);
		for (j = 0;j < x;j++) //??????????????????
		{
			if (n[j] < y && n[j]>0)
			{
				y = n[j];
				m = j;
			}
		}
		System.out.printf("%s\n",b[m]);
		return 0;
	}
}

