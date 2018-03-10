# RecyclerViewCheckBox5727
CheckBox state maintained while scrolling items in RecyclerView.

<a href="https://imgflip.com/gif/263srf"><img src="https://i.imgflip.com/263srf.gif" title="made at imgflip.com"/></a>

This sample code contains 3 files which can be found here: 
app/src/main/java/com/example/jay/recyclerviewcheckbox5727/ <br />

* StudentActivity
* StudentAdapter
* StudentModel

## StudentActivity ##
 Responsible for loading dummy data from Students.json present inside assets folder. <br/> Source can be REST API also depending on requirement.

## StudentAdapter ##
     DataSource for RecyclerView.

## StudentModel ##	
		
Use your model to hold the current state of the view.
You could have a boolean field in your model for the Recycler View to hold the state of your current item.So in your Model class you can have

    private boolean isSelected;
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }	
