package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  float[] male = new float[42];
	  float[] female = new float[40];
	  String sex = new String(new char[8]);
	  final String ma = "male";
	  final String fe = "female";
	  float height;
	  int n;
	  int i = 0;
	  int j = 0;
	  int m_num = 0;
	  int f_num = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n != 0)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sex = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			height = Float.parseFloat(tempVar3);
		}
		if (strcmp(sex,ma) == 0)
		{
		  male[i] = height;
		  i++;
		  m_num++;
		}
		else
		{
			female[j] = height;
			j++;
			f_num++;
		}
		n--;
	  }
	  float tmp;
	  for (i = 1;i <= m_num;i++)
	  {
		  for (j = 0;j < m_num - 1;j++)
		  {
			  if (male[j] > male[j + 1])
			  {
				tmp = male[j];
				male[j] = male[j + 1];
				male[j + 1] = tmp;
			  }
		  }
	  }

	  for (i = 1;i <= f_num;i++)
	  {
		  for (j = 0;j < f_num - 1;j++)
		  {
			  if (female[j] < female[j + 1])
			  {
				tmp = female[j];
				female[j] = female[j + 1];
				female[j + 1] = tmp;
			  }
		  }
	  }

	  for (i = 1;i <= f_num;i++)
	  {
		  male[i + m_num - 1] = female[i - 1];
	  }

	  for (i = 0;i < m_num + f_num - 1;i++)
	  {
		  System.out.printf("%.2f ",male[i]);
	  }
	  System.out.printf("%.2f",male[m_num + f_num - 1]);
	  return 0;
	}
}

