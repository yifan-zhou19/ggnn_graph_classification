package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t;
		int length_1;
		int length_2;
		String[] pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (String)malloc(2 * sizeof(String));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pp[0] = (String)malloc(50 * (Character.SIZE / Byte.SIZE));
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
		length_1 = String.valueOf(pp[0]).length();
		length_2 = String.valueOf(pp[1]).length();
		for (i = 0;i < length_2;i++)
		{
			t = 0;
		  for (j = 0;j < length_1;j++)
		  {
			if (pp[0][j] != pp[1][i + j])
			{
			  t = 1;
			  break;
			}
		  }
		  if (t == 0)
		  {
				System.out.printf("%d",i);
				break;
		  }
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp[0]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp[1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp);
	}
}

