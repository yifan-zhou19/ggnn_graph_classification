package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	String[] pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	pp = (String)malloc(3 * sizeof(String));
	for (i = 0;i < 3;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	pp[i] = (String)malloc(51 * (Character.SIZE / Byte.SIZE));
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		pp[0] = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		pp[1] = tempVar2.charAt(0);
	}
	for (i = 0;i < (String.valueOf(pp[1]).length());i++)
	{
		if (pp[1][i] == pp[0][0])
		{
			for (k = 0;k < (String.valueOf(pp[0]).length());k++)
			{
				pp[2][String.valueOf(pp[0]).length()] = 0;
			pp[2][k] = pp[1][k + i];
			}
			if (strcmp(pp[0],pp[2]) == 0)
			{
				System.out.printf("%d",i);
			break;
			}
		}
	}
	return (0);
	}





}

