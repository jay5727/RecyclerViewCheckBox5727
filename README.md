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
   

An adapter manages the data model and adapts it to the individual entries in the widget. 

It extends the RecyclerView.Adapter class and is assigned to the recycler view via the RecyclerView.setAdapter method from Activity/Fragment.
The input to the adapter of an recycler view can be any List ![](http://latex.codecogs.com/gif.latex?%3CT%3E) where T can be any model class itself. 

Based on this input the adapter must return the total number of items via its **getItemCount()** method.

The adapter prepares the layout of the items by inflating the correct layout for the individual data elements. This work is done in the onCreateViewHolder method. 

It returns an object of type ViewHolder per visual entry in the recycler view.

This instance is used to access the views in the inflated layout. 

The **onCreateViewHolder** method is only called then a new view must be created.

Once a data item becomes visible, the adapter assigns this data to the individual widgets. 
This work is done in the **onBindViewHolder** method.

## StudentModel ##	
Data Source for RecyclerView. <br />		
Use your model to hold the current state of the view.
You could have a boolean field in your model for the Recycler View to hold the state of your current item.So in your Model class you can have

    private boolean isSelected;
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }	
