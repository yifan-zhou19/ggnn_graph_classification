public class point3D
{
	public int x;
	public int y;
	public int z;
}
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
	temp = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y) + (p1.z - p2.z) * (p1.z - p2.z);

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//	return sqrtf((float)temp UnnamedParameter);
}


	public static int Main()
	{
		point3D[] points = tangible.Arrays.initializeWithDefaultpoint3DInstances(MAXPOINTS); //????? ???????
		result[] results = tangible.Arrays.initializeWithDefaultresultInstances(MAXRESULTS); //??????????????

		int i;
		int j;
		int k;
		int pointNum;
		int resultNum;

		result temp = new result();

		//?????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			pointNum = Integer.parseInt(tempVar);
		}

		resultNum = pointNum * (pointNum - 1) / 2;
		//?????
		for (i = 0; i < pointNum; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				points[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				points[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				points[i].z = Integer.parseInt(tempVar4);
			}
		}

		//??????
		k = 0;
		for (i = 0; i < pointNum; i++)
		{
			for (j = i + 1; j < pointNum; j++)
			{
				results[k].firstPointIndex = i;
				results[k].lastPointIndex = j;
				results[k].distance = getDistance(points[i], points[j]);
				k++;
			}
		}


		//?????????? ??????
		for (i = 0; i < resultNum - 1; i++)
		{
			for (j = 0; j < resultNum - i - 1; j++)
			{
				if (results[j].distance < results[j + 1].distance)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = results[j];
					temp.copyFrom(results[j]);
					results[j] = results[j + 1];
					results[j + 1] = temp;
				}
			}
		}

		//????
		for (i = 0; i < resultNum; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", points[results[i].firstPointIndex].x, points[results[i].firstPointIndex].y, points[results[i].firstPointIndex].z, points[results[i].lastPointIndex].x, points[results[i].lastPointIndex].y, points[results[i].lastPointIndex].z, results[i].distance);
		}

		return 0;
	}
}

