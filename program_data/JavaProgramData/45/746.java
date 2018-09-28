package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] pp;
		int i;
		int j;
		int m = 0;
		int l1;
		int l2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (String)malloc(2 * sizeof(String));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pp[0] = (String)malloc(5 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pp[1] = (String)malloc(50 * (Character.SIZE / Byte.SIZE));
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
		l1 = String.valueOf(pp[0]).length();
		l2 = String.valueOf(pp[1]).length();
		for (i = 0;i < l2 - l1;i++)
		{
			for (j = 0;j < l1;j++)
			{
				if (pp[0][j] != pp[1][j + i])
				{
					break;
				}
			}
			if (j == l1)
			{
				break;
			}
		}
			System.out.printf("%d",i);
	}

}

