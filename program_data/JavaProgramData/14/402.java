public class stud
{
		public int id;
		public float langrade;
		public float mathgrade;
}

package <missing>;

public class GlobalMembers
{
			public static stud[] student = tangible.Arrays.initializeWithDefaultstudInstances(100000);
			public static stud s = new stud();
		public static int student_num;
		public static float[] total = new float[100000];
		public static float t;
	public static void trisort()
	{
		for (int i = 0;i < 2;i++)
		{
		   for (int j = 0;j < 2 - i;j++)
		   {
			  if (total[j] < total[j + 1])
			  {
				 t = total[j];
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s=student[j];
				 s.copyFrom(student[j]);
				 total[j] = total[j + 1];
				 student[j] = student[j + 1];
				 total[j + 1] = t;
				 student[j + 1] = s;
			  }
		   }
		}
	}
	public static int Main()
	{
		int i;
		int j;
		student_num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < student_num;i++)
		{
			student[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			student[i].langrade = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			student[i].mathgrade = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  total[i] = student[i].langrade + student[i].mathgrade;
		}
		for (j = 3;j < student_num;j++)
		{
				trisort();
			 if (total[j] > total[2])
			 {
					t = total[2];
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s=student[2];
					s.copyFrom(student[2]);
					total[2] = total[j];
					student[2] = student[j];
					total[j] = t;
					student[j] = s;
			 }
		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(student[i].id);
			System.out.print(" ");
			System.out.print(total[i]);
			System.out.print("\n");
		}
		return 0;



	}

}

