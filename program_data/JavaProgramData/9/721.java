public class hospital
{
		public String ID = new String(new char[11]);
		public int age;
}

package <missing>;

public class GlobalMembers
{
		public static hospital[] old = tangible.Arrays.initializeWithDefaulthospitalInstances(100);
		public static hospital[] young = tangible.Arrays.initializeWithDefaulthospitalInstances(100);
		public static hospital[] all = tangible.Arrays.initializeWithDefaulthospitalInstances(100);
		public static hospital temp = new hospital();
	public static void sequence(hospital[] matrix, int n)
	{
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (matrix[j].age < matrix[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=matrix[j];
					temp.copyFrom(matrix[j]);
					matrix[j] = matrix[j + 1];
					matrix[j + 1] = temp;
				}
			}
		}
	}

		/*
		??????????????????
		{
		int i,j,k;
		for(i=0;i<n-1;i++)
		{
			k=i;
			for(j=i+1;j<n;j++)
			{
				if(matrix[j].age>matrix[k].age)
				{
					k=j;
				}
			}
			if(k!=i)
			{
				temp=matrix[i];
				matrix[i]=matrix[k];
				matrix[k]=temp;
			}
		}
	}
	*/

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				all[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				all[i].age = Integer.parseInt(tempVar3);
			}
		}
		int oi = 0;
		int yi = 0;
		for (i = 0;i < n;i++)
		{
			if (all[i].age >= 60)
			{
				old[oi] = all[i];
				oi++;
			}
			else
			{
				young[yi] = all[i];
				yi++;
			}
		}
		sequence(old, oi);
		for (i = 0;i < oi;i++)
		{
			System.out.printf("%s\n",old[i].ID);
		}
		for (i = 0;i < yi;i++)
		{
			System.out.printf("%s\n",young[i].ID);
		}
		return 0;
	}


}

